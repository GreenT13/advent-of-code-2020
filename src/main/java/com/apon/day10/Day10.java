package com.apon.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day10 {

    private List<Integer> createSortedInputWithZeroAndMaxPlusThree(String input) {
        List<Integer> integers = Arrays.stream(input.split("\n")).map(Integer::parseInt).collect(Collectors.toList());
        integers.add(0);
        integers.add(3 + integers.stream().mapToInt(x -> x).max().getAsInt());

        Collections.sort(integers);
        return integers;
    }

    public int part1(String input) {
        List<Integer> integers = createSortedInputWithZeroAndMaxPlusThree(input);

        Integer previous = null;
        int countDiff1 = 0;
        int countDiff3 = 0;
        for (Integer integer : integers) {
            if (previous != null) {
                if (integer - previous == 1) {
                    countDiff1++;
                } else if (integer - previous == 3) {
                    countDiff3++;
                } else {
                    System.out.println("Difference of 2");
                }
            }

            previous = integer;
        }

        return countDiff1 * countDiff3;
    }

    public long part2(String input) {
        List<Integer> integers = createSortedInputWithZeroAndMaxPlusThree(input);

        // Count one extra, because it doesn't count the initial variant as valid.
        return getAllSubsets(integers);
    }

    private long getAllSubsets(List<Integer> integers) {
        long totalNrOfSubsets = 1;

        // Every subset is a combination where before the first integer and after the last integer is a gap of 3.
        List<Integer> currentSubset = new ArrayList<>();
        int maxIntegerFromSubset = -1;
        for (Integer integer : integers) {
            if (integer - maxIntegerFromSubset == 3) {
                // Process the subset by counting it.
                int nr = getNrOfSubsetsPossible(currentSubset);
                totalNrOfSubsets *= nr;

                // We go into a new set.
                currentSubset = new ArrayList<>();
            }
            currentSubset.add(integer);
            maxIntegerFromSubset = integer;
        }

        return totalNrOfSubsets;
    }

    private int getNrOfSubsetsPossible(List<Integer> subset) {
        // Small sets are easy, only one possibility.
        if (subset.size() == 1 || subset.size() == 2) {
            return 1;
        }

        return countNrOfValidSubCombinations(subset, subset.get(0), subset.get(subset.size() - 1), new HashSet<>()) + 1;
    }

    private int countNrOfValidSubCombinations(List<Integer> integers, int min, int max, Set<Integer> processedHashes) {
        int nrOfValidCombinations = 0;

        // We never have to start with 0 or max size, since these items may not be removed.
        for (int i = 1; i < integers.size() - 1; i++) {
            // Remove integer i, check if it is valid. If so, we found a new combination.
            List<Integer> clonedWithRemoved = cloneListWithRemovedEntry(integers, i);

            // Make sure we don't check doubles. We do this by checking that the hash is different.
            int hashCode = clonedWithRemoved.hashCode();
            if (processedHashes.contains(hashCode)) {
                continue;
            } else {
                processedHashes.add(hashCode);
            }
            if (isValid(clonedWithRemoved, min, max, i)) {
                nrOfValidCombinations += 1 + countNrOfValidSubCombinations(clonedWithRemoved, min, max, processedHashes);
            }
        }

        return nrOfValidCombinations;
    }

    private List<Integer> cloneListWithRemovedEntry(List<Integer> integers, int indexToRemove) {
        List<Integer> newIntegers = new ArrayList<>(integers);
        newIntegers.remove(indexToRemove);
        return newIntegers;
    }

    private boolean isValid(List<Integer> integers, int min, int max, int indexRemoved) {
        if (integers.get(0) != min) {
            return false;
        }
        if (integers.get(integers.size() - 1) != max) {
            return false;
        }

        // Could be optimized by only checking the around the removed integer.
        Integer first = integers.get(indexRemoved - 1);
        Integer middle = integers.get(indexRemoved);
        if (middle - first > 3) {
            return false;
        }

        return indexRemoved >= integers.size() - 1 || integers.get(indexRemoved + 1) - middle <= 3;
    }
}
