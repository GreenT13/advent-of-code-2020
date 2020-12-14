package com.apon.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day5 {

    public int part1(String input) {
        return Arrays.stream(input.split("\n"))
                .mapToInt(Day5::parseLine)
                .max()
                .getAsInt();
    }

    public int part2(String input) {
        List<Integer> seatIds = Arrays.stream(input.split("\n"))
                .map(Day5::parseLine)
                .collect(Collectors.toList());

        // We can range from 0 to maximum value, since we always check plus and minus one.
        // Skipping items from the range is only a small performance boost.
        for (int i = 0; i < 127 * 8 + 8; i++) {
            if (!seatIds.contains(i) && seatIds.contains(i-1) && seatIds.contains(i+1)) {
                return i;
            }
        }

        throw new RuntimeException("All seats are in the list!");
    }

    private static Integer parseLine(String line) {
        return 8 * convertBinaryToDecimal(line.substring(0, 7), 'B', 'F') + convertBinaryToDecimal(line.substring(7), 'R', 'L');
    }

    private static int convertBinaryToDecimal(String input, char one, char zero) {
        String inputAsBinaryNumber = input.replace(one, '1').replace(zero, '0');
        return Integer.valueOf(inputAsBinaryNumber, 2);
    }
}
