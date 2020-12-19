package com.apon.day18;

import java.util.Arrays;

public class Day18 {
    public long part1(String input) {
        CalculatorPart1 calculatorPart1 = new CalculatorPart1();
        return Arrays.stream(input.split("\n"))
                .map(Element::parseStringToElements)
                .mapToLong(calculatorPart1::calculate)
                .sum();
    }

    public long part2(String input) {
        CalculatorPart2 calculatorPart2 = new CalculatorPart2();
        return Arrays.stream(input.split("\n"))
                .map(Element::parseStringToElements)
                .mapToLong(calculatorPart2::calculate)
                .sum();
    }
}
