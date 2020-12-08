package com.apon.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6Test {
    @Test
    public void part1() {
        Day6 day6 = new Day6();
        assertEquals(11, day6.part1(Day6Input.EXAMPLE_INPUT));
        System.out.println(day6.part1(Day6Input.INPUT));
    }

    @Test
    public void part2() {
        Day6 day6 = new Day6();
        assertEquals(6, day6.part2(Day6Input.EXAMPLE_INPUT));
        System.out.println(day6.part2(Day6Input.INPUT));
    }
}
