package com.apon.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {
    @Test
    public void part1() {
        Day2 day2 = new Day2();
        assertEquals(2, day2.part1(Day2Input.EXAMPLE_INPUT));
        System.out.println(day2.part1(Day2Input.INPUT));
    }

    @Test
    public void part2() {
        Day2 day2 = new Day2();
        assertEquals(1, day2.part2(Day2Input.EXAMPLE_INPUT));
        System.out.println(day2.part2(Day2Input.INPUT));
    }
}
