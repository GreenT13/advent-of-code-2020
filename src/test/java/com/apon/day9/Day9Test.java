package com.apon.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day9Test {
    @Test
    public void part1() {
        Day9 day9 = new Day9();
        assertEquals(127, day9.part1(Day9Input.EXAMPLE_INPUT, 5));
        System.out.println(day9.part1(Day9Input.INPUT, 25));
    }

    @Test
    public void part2() {
        Day9 day9 = new Day9();
        assertEquals(62, day9.part2(Day9Input.EXAMPLE_INPUT, 5));
        System.out.println(day9.part2(Day9Input.INPUT, 25));
    }
}
