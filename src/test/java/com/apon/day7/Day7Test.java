package com.apon.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day7Test {
    @Test
    public void part1() {
        Day7 day7 = new Day7();
        assertEquals(4, day7.part1(Day7Input.EXAMPLE_INPUT));
        System.out.println(day7.part1(Day7Input.INPUT));
    }

    @Test
    public void part2() {
        Day7 day7 = new Day7();
        assertEquals(32, day7.part2(Day7Input.EXAMPLE_INPUT));
        assertEquals(126, day7.part2(Day7Input.PART2_EXAMPLE_INPUT));
        System.out.println(day7.part2(Day7Input.INPUT));
    }
}
