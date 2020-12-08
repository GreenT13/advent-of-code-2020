package com.apon.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day4Test {
    @Test
    public void part1() {
        Day4 day4 = new Day4();
        assertEquals(2, day4.part1(Day4Input.EXAMPLE_INPUT));
        System.out.println(day4.part1(Day4Input.INPUT));
    }

    @Test
    public void part2() {
        Day4 day4 = new Day4();
        assertEquals(0, day4.part2(Day4Input.PART2_INVALID_EXAMPLES));
        assertEquals(4, day4.part2(Day4Input.PART2_VALID_EXAMPLES));
        System.out.println(day4.part2(Day4Input.INPUT));
    }
}
