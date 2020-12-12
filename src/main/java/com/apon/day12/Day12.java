package com.apon.day12;

import java.util.Arrays;

public class Day12 {

    public long part1(String input) {
        LocationPart1 location = new LocationPart1();

        Arrays.stream(input.split("\n")).map(Action::of).forEach(location::adjustLocation);

        return location.calculateManhattanDistance();
    }

    public long part2(String input) {
        LocationPart2 location = new LocationPart2();

        Arrays.stream(input.split("\n")).map(Action::of).forEach(location::adjustLocation);

        return location.calculateManhattanDistance();
    }
}
