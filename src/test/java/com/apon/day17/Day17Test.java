package com.apon.day17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day17Test {
    @Test
    void part1() {
        Day17 day17 = new Day17();
        assertEquals(112, day17.part1(Day17Input.EXAMPLE_INPUT));
        System.out.println(day17.part1(Day17Input.INPUT));
    }

    @Test
    void part2() {
        Day17 day17 = new Day17();
        assertEquals(848, day17.part2(Day17Input.EXAMPLE_INPUT));
        System.out.println(day17.part2(Day17Input.INPUT));
    }
}
