package com.apon.day12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day12Test {
    @Test
    void part1() {
        Day12 day12 = new Day12();
        assertEquals(25, day12.part1(Day12Input.EXAMPLE_INPUT));
        System.out.println(day12.part1(Day12Input.INPUT));
    }

    @Test
    void part2() {
        Day12 day12 = new Day12();
        assertEquals(286, day12.part2(Day12Input.EXAMPLE_INPUT));
        System.out.println(day12.part2(Day12Input.INPUT));
    }
}
