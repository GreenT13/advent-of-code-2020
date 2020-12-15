package com.apon.day15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day15Test {
    @Test
    void part1() {
        Day15 day15 = new Day15();
        assertEquals(436, day15.part1(Day15Input.EXAMPLE_INPUT));
        assertEquals(1, day15.part1(Day15Input.EXAMPLE_INPUT_2));
        assertEquals(10, day15.part1(Day15Input.EXAMPLE_INPUT_3));
        assertEquals(27, day15.part1(Day15Input.EXAMPLE_INPUT_4));
        assertEquals(78, day15.part1(Day15Input.EXAMPLE_INPUT_5));
        assertEquals(438, day15.part1(Day15Input.EXAMPLE_INPUT_6));
        assertEquals(1836, day15.part1(Day15Input.EXAMPLE_INPUT_7));

        System.out.println(day15.part1(Day15Input.INPUT));
    }

    @Test
    void part2() {
        Day15 day15 = new Day15();
        assertEquals(175594, day15.part2(Day15Input.EXAMPLE_INPUT));
        assertEquals(2578, day15.part2(Day15Input.EXAMPLE_INPUT_2));
        assertEquals(3544142, day15.part2(Day15Input.EXAMPLE_INPUT_3));
        assertEquals(261214, day15.part2(Day15Input.EXAMPLE_INPUT_4));
        assertEquals(6895259, day15.part2(Day15Input.EXAMPLE_INPUT_5));
        assertEquals(18, day15.part2(Day15Input.EXAMPLE_INPUT_6));
        assertEquals(362, day15.part2(Day15Input.EXAMPLE_INPUT_7));

        System.out.println(day15.part2(Day15Input.INPUT));
    }

}
