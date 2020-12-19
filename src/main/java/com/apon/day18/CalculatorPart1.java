package com.apon.day18;

import java.util.List;
import java.util.function.BiFunction;

public class CalculatorPart1 {

    public long calculate(List<Element> elements) {
        long result = 0;

        // Start with sum, so that when we get to the first integer, we sum it with 0 (initializing to the first number).
        BiFunction<Long, Long, Long> operation = Long::sum;

        for (Element element : elements) {
            switch (element.elementType) {
                case PLUS -> operation = Long::sum;
                case MULTIPLY -> operation = (long1, long2) -> long1 * long2;
                case NUMBER -> result = operation.apply(result, element.number);
                case ENCLOSED_BY_PARENTHESES -> result = operation.apply(result, calculate(element.enclosedElements));
            }
        }

        return result;
    }

}
