package com.apon.day11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11Test {
    @Test
    void part1() {
        Day11 day11 = new Day11();
        assertEquals(37, day11.part1(Day11Input.EXAMPLE_INPUT));
        System.out.println(day11.part1(Day11Input.INPUT));
    }

    @Test
    void part2() {
        Day11 day11 = new Day11();
        assertEquals(26, day11.part2(Day11Input.EXAMPLE_INPUT));
        System.out.println(day11.part2(Day11Input.INPUT));
    }
}
