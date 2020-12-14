package com.apon.day14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day14Test {
    @Test
    void part1() {
        Day14 day14 = new Day14();
        assertEquals(165, day14.part1(Day14Input.EXAMPLE_INPUT));
        System.out.println(day14.part1(Day14Input.INPUT));
    }

    @Test
    void part2() {
        Day14 day14 = new Day14();
        assertEquals(208, day14.part2(Day14Input.PART2_EXAMPLE_INPUT));
        System.out.println(day14.part2(Day14Input.INPUT));
    }
}
