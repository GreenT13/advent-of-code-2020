package com.apon.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day5Test {
    @Test
    public void part1() {
        Day5 day5 = new Day5();
        assertEquals(820, day5.part1(Day5Input.EXAMPLE_INPUT));
        System.out.println(day5.part1(Day5Input.INPUT));
    }

    @Test
    public void part2() {
        Day5 day5 = new Day5();
        System.out.println(day5.part2(Day5Input.INPUT));
    }
}
