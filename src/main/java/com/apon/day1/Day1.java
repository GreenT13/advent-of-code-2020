package com.apon.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Day1 {

    private List<Integer> parseInput(String input) {
        return Arrays.stream(input.split("\n"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int part1(String input) {
        List<Integer> integers = parseInput(input);

        Set<Integer> neededIntegers = new HashSet<>();
        for (Integer integer : integers) {
            if (neededIntegers.contains(integer)) {
                return integer * (2020 - integer);
            }

            neededIntegers.add(2020 - integer);
        }

        throw new RuntimeException("There should always be two integers that sum to 2020 in the input!");
    }

    public int part2(String input) {
        List<Integer> integers = parseInput(input);

        Set<TripleCombination> neededTripleCombinations = new HashSet<>();

        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size(); j++) {
                // We cannot reuse the same number, so skip these entries.
                // We need to loop based on index, since the list could contain duplicates.
                if (j == i) {
                    continue;
                }
                neededTripleCombinations.add(new TripleCombination(integers.get(i), integers.get(j)));
            }
        }

        for (Integer integer : integers) {
            Optional<TripleCombination> optional = neededTripleCombinations.stream()
                    .filter(x -> x.needed == integer)
                    .findAny();

            if (optional.isPresent()) {
                return optional.get().product();
            }
        }


        throw new RuntimeException("There should always be three integers that sum to 2020 in the input!");
    }

    private static class TripleCombination {
        public final int first;
        public final int second;
        public final int needed;

        public TripleCombination(int first, int second) {
            this.first = first;
            this.second = second;
            this.needed = 2020 - first - second;
        }

        public int product() {
            return first * second * needed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TripleCombination that = (TripleCombination) o;
            return first == that.first &&
                    second == that.second &&
                    needed == that.needed;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second, needed);
        }
    }

}
