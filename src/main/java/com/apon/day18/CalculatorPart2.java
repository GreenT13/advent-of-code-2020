package com.apon.day18;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CalculatorPart2 {
    public long calculate(List<Element> elements) {
        List<Integer> indexOfEnclosedElements = elements.stream()
                .filter(x -> ElementType.ENCLOSED_BY_PARENTHESES.equals(x.elementType))
                .map(elements::indexOf)
                .collect(Collectors.toList());

        for (Integer indexOfEnclosed : indexOfEnclosedElements) {
            // Calculate the result of the group.
            long number = calculate(elements.get(indexOfEnclosed).enclosedElements);

            // Replace the group with the calculated result.
            elements.set(indexOfEnclosed, Element.number(number));
        }

        // No parentheses are left. Calculate the result.
        return calculateWithoutParentheses(elements);
    }

    private long calculateWithoutParentheses(List<Element> elements) {
        // First parse all plus signs.
        Optional<Integer> indexOfPlusSign ;
        while ((indexOfPlusSign = elements.stream()
                .filter(x -> ElementType.PLUS.equals(x.elementType))
                .map(elements::indexOf)
                .findAny()).isPresent()) {
            long number1 = elements.get(indexOfPlusSign.get() - 1).number;
            long number2 = elements.get(indexOfPlusSign.get() + 1).number;

            // Replace the element before the plus, the plus itself and the element after the plus with summed element.
            elements.remove(indexOfPlusSign.get() - 1);
            elements.remove(indexOfPlusSign.get() - 1);
            elements.remove(indexOfPlusSign.get() - 1);
            elements.add(indexOfPlusSign.get() - 1, Element.number(number1 + number2));
        }

        // All that is left, is to parse the rest of the integers from left to right. There are still numbers left
        // to multiply if the size is larger than one.
        while (elements.size() > 1) {
            long number1 = elements.get(0).number;
            long number2 = elements.get(2).number;

            elements.remove(0);
            elements.remove(0);
            elements.remove(0);
            elements.add(0, Element.number(number1 * number2));
        }

        return elements.get(0).number;
    }
}
