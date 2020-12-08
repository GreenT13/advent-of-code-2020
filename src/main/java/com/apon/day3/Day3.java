package com.apon.day3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Day3 {
    private final static char TREE = '#';

    public int part1(String input) {
        List<String> board = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        return traverse(board, 3, 1);
    }

    public int part2(String input) {
        List<String> board = Arrays.stream(input.split("\n")).collect(Collectors.toList());
        return traverse(board, 1, 1) *
                traverse(board, 3, 1) *
                traverse(board, 5, 1) *
                traverse(board, 7, 1) *
                traverse(board, 1, 2);
    }

    private int traverse(List<String> board, int deltaX, int deltaY) {
        int boardWidth = board.get(0).length();

        int nrOfTrees = 0;
        int x = 0;

        Iterator<String> iterator = board.iterator();

        while (iterator.hasNext()) {
            String line = iterator.next();

            if (TREE == line.charAt(x)) {
                nrOfTrees++;
            }

            // We always move by one step on the next round. For each other step, increment.
            for (int i = 0; i < deltaY - 1; i++) {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            }
            x = (x + deltaX) % boardWidth;
        }

        return nrOfTrees;
    }
}
