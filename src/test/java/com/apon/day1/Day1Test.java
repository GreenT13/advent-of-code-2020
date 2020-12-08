package com.apon.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @Test
    public void part1() {
        Day1 day1 = new Day1();
        assertEquals(514579, day1.part1(Day1Input.EXAMPLE_INPUT));
        System.out.println(day1.part1(Day1Input.INPUT));
    }

    @Test
    public void part2() {
        Day1 day1 = new Day1();
        assertEquals(241861950, day1.part2(Day1Input.EXAMPLE_INPUT));
        System.out.println(day1.part2(Day1Input.INPUT));
    }
}
