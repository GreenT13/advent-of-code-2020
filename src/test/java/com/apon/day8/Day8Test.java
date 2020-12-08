package com.apon.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day8Test {
    @Test
    public void part1() {
        Day8 day8 = new Day8();
        assertEquals(5, day8.part1(Day8Input.EXAMPLE_INPUT));
        System.out.println(day8.part1(Day8Input.INPUT));
    }

    @Test
    public void part2() {
        Day8 day8 = new Day8();
        assertEquals(8, day8.part2(Day8Input.EXAMPLE_INPUT));
        System.out.println(day8.part2(Day8Input.INPUT));
    }
}
