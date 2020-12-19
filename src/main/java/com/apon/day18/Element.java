package com.apon.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Element {
    public final ElementType elementType;
    public final Long number;
    public final List<Element> enclosedElements;

    public Element(ElementType elementType) {
        this.elementType = elementType;
        this.number = null;
        this.enclosedElements = null;
    }

    private Element(ElementType elementType, Long number) {
        this.elementType = elementType;
        this.number = number;
        this.enclosedElements = null;
    }

    public Element(ElementType elementType, List<Element> enclosedElements) {
        this.elementType = elementType;
        this.number = null;
        this.enclosedElements = enclosedElements;
    }

    @Override
    public String toString() {
        return "Element{" +
                "elementType=" + elementType +
                ", number=" + number +
                '}';
    }

    public static List<Element> parseStringToElements(String line) {
        List<Element> result = new ArrayList<>();
        Iterator<String> elementIterator = Arrays.stream(line.replaceAll(" ", "").split("(?=\\(|\\)|\\+|\\*|\\b)")).iterator();
        while (elementIterator.hasNext()) {
            String element = elementIterator.next();
            result.add(determineNextElement(elementIterator, element));
        }
        return result;
    }

    private static Element determineNextElement(Iterator<String> elementIterator, String element) {
        return switch (element) {
            case "+" -> plus();
            case "*" -> multiply();
            case "(" -> {
                // Loop over the iterator until you have the ending sign.
                StringBuilder subElements = new StringBuilder();
                int nrOfSubGroups = 1;
                while (nrOfSubGroups > 0) {
                    String subElement = elementIterator.next();
                    subElements.append(subElement);
                    if ("(".equals(subElement)) {
                        nrOfSubGroups++;
                    } else if (")".equals(subElement)) {
                        nrOfSubGroups--;
                    }
                }
                // Remove the last closing parenthesis that is added.
                subElements.deleteCharAt(subElements.length() - 1);
                yield enclosedByParentheses(parseStringToElements(subElements.toString()));
            }
            // All other cases must be digits. If not, exception will be thrown automatically.
            default -> number(Long.parseLong(element));
        };
    }

    public static Element number(long number) {
        return new Element(ElementType.NUMBER, number);
    }

    private static Element plus() {
        return new Element(ElementType.PLUS);
    }

    private static Element multiply() {
        return new Element(ElementType.MULTIPLY);
    }

    private static Element enclosedByParentheses(List<Element> elements) {
        return new Element(ElementType.ENCLOSED_BY_PARENTHESES, elements);
    }
}
