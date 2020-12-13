package com.apon.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day13Test {
    @Test
    void part1() {
        Day13 day13 = new Day13();
        assertEquals(295, day13.part1(Day13Input.EXAMPLE_INPUT));
        System.out.println(day13.part1(Day13Input.INPUT));
    }

    @Test
    void part2() {
        Day13 day13 = new Day13();

        assertEquals(3417, day13.part2(Day13Input.PART2_EXAMPLE_1));
        assertEquals(1068781, day13.part2(Day13Input.EXAMPLE_INPUT));
        assertEquals(754018, day13.part2(Day13Input.PART2_EXAMPLE_2));
        assertEquals(779210, day13.part2(Day13Input.PART2_EXAMPLE_3));
        assertEquals(1261476, day13.part2(Day13Input.PART2_EXAMPLE_4));
        assertEquals(1202161486, day13.part2(Day13Input.PART2_EXAMPLE_5));
        System.out.println(day13.part2(Day13Input.INPUT));
    }
}
