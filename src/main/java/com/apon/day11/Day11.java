package com.apon.day11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day11 {

    private char[][] createFromInput(String input) {
        List<String> strings = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        int width = strings.get(0).length();
        int height = strings.size();
        char[][] layout = new char[height][width];
        int i = 0, j = 0;
        for (String string : strings) {
            for (char c : string.toCharArray()) {
                layout[i][j] = c;
                j++;
            }
            i++; j = 0;
        }

        return layout;
    }

    public long part1(String input) {
        char[][] layout = createFromInput(input);
        BoardPart1 board = new BoardPart1(layout);
        while (board.nextSteps()) {
            // Just repeat until no changes occur.
        }
        return board.calculateNrOfOccupiedSeats();
    }

    public long part2(String input) {
        char[][] layout = createFromInput(input);
        BoardPart2 board = new BoardPart2(layout);
        while (board.nextSteps()) {
            // Just repeat until no changes occur.
        }
        return board.calculateNrOfOccupiedSeats();
    }
}
