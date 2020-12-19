package com.apon.day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day18Test {
    @Test
    void part1() {
        Day18 day18 = new Day18();
        assertEquals(71, day18.part1("1 + 2 * 3 + 4 * 5 + 6"));
        assertEquals(26457, day18.part1(Day18Input.EXAMPLE_INPUT));
        System.out.println(day18.part1(Day18Input.INPUT));
    }

    @Test
    void part2() {
        Day18 day18 = new Day18();
        assertEquals(231, day18.part2("1 + 2 * 3 + 4 * 5 + 6"));
        assertEquals(694173, day18.part2(Day18Input.EXAMPLE_INPUT));
        System.out.println(day18.part2(Day18Input.INPUT));
    }
}
