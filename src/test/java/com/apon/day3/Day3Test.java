package com.apon.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {
    @Test
    public void part1() {
        Day3 day3 = new Day3();
        assertEquals(7, day3.part1(Day3Input.EXAMPLE_INPUT));
        System.out.println(day3.part1(Day3Input.INPUT));
    }

    @Test
    public void part2() {
        Day3 day3 = new Day3();
        assertEquals(336, day3.part2(Day3Input.EXAMPLE_INPUT));
        System.out.println(day3.part2(Day3Input.INPUT));
    }
}
