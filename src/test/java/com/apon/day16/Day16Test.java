package com.apon.day16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day16Test {
    @Test
    void part1() {
        Day16 day16 = new Day16();
        assertEquals(71, day16.part1(Day16Input.EXAMPLE_INPUT));
        System.out.println(day16.part1(Day16Input.INPUT));
    }

    @Test
    void part2() {
        Day16 day16 = new Day16();
        assertEquals(12*11, day16.part2(Day16Input.PART2_EXAMPLE_INPUT));
        System.out.println(day16.part2(Day16Input.INPUT));
    }
}
