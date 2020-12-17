package com.apon.day17;

import java.util.HashSet;
import java.util.Set;

public class Day17 {
    public long part1(String input) {
        Grid grid = part1FromInput(input);
        for (int i = 0; i < 6; i++) {
            grid.doNextStep();
        }

        return grid.getNrOfActiveCubes();
    }

    public long part2(String input) {
        Grid grid = part2FromInput(input);
        for (int i = 0; i < 6; i++) {
            grid.doNextStep();
        }

        return grid.getNrOfActiveCubes();
    }

    private Grid part1FromInput(String input) {
        Set<Coordinate> activeCubes = new HashSet<>();
        int x = 0;
        int y = 0;
        for (String line : input.split("\n")) {
            for (Character character : line.toCharArray()) {
                if (character == '#') {
                    // We make a grid where Z is always zero.
                    activeCubes.add(new ThreeDimCoordinate(x, y, 0));
                }
                x++;
            }

            x = 0;
            y++;
        }

        return new Grid(activeCubes);
    }

    private Grid part2FromInput(String input) {
        Set<Coordinate> activeCubes = new HashSet<>();
        int x = 0;
        int y = 0;
        for (String line : input.split("\n")) {
            for (Character character : line.toCharArray()) {
                if (character == '#') {
                    // We make a grid where Z is always zero.
                    activeCubes.add(new FourDimCoordinate(x, y, 0, 0));
                }
                x++;
            }

            x = 0;
            y++;
        }

        return new Grid(activeCubes);
    }


}
