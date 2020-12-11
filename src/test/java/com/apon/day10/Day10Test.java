package com.apon.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day10Test {
    @Test
    void part1() {
        Day10 day10 = new Day10();
        assertEquals(220, day10.part1(Day10Input.EXAMPLE_INPUT));
        System.out.println(day10.part1(Day10Input.INPUT));
    }

    @Test
    void part2() {
        Day10 day10 = new Day10();
        assertEquals(8, day10.part2(Day10Input.SMALL));
        assertEquals(19208, day10.part2(Day10Input.EXAMPLE_INPUT));
        System.out.println(day10.part2(Day10Input.INPUT));
    }
}
