package com.apon.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Day6 {
    public int part1(String input) {
        // Split by \n\n, so we each item is the entire group.
        return Arrays.stream(input.split("\n\n"))
                .map(Day6::convertToCharacterSet)
                // Each group has multiple lines for each person. We don't use the fact that we have multiple lines,
                // we just want to get all the characters. The \n in between is not filtered, so remove this manually.
                .peek(x -> x.remove('\n'))
                .mapToInt(Set::size)
                .sum();
    }
    public int part2(String input) {
        // Split by \n\n, so we each item is the entire group. We can split by \n after that, to get each line in the group.
        return Arrays.stream(input.split("\n\n"))
                .mapToInt(group -> Arrays.stream(group.split("\n"))
                        .map(Day6::convertToCharacterSet)
                        .reduce(Day6::intersection)
                        .orElseThrow()
                        .size())
                .sum();
    }

    private static Set<Character> convertToCharacterSet(String string) {
        return string.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

}
