package com.apon.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Day9 {
    public long part1(String input, int preambleLength) {
        List<Long> inputList = Arrays.stream(input.split("\n")).map(Long::parseLong).collect(Collectors.toList());

        LimitedQueue<Long> limitedQueue = new LimitedQueue<>(preambleLength);
        for (Long l : inputList) {
            if (limitedQueue.size() == preambleLength && !isSumOfTwo(l, limitedQueue)) {
                return l;
            }

            limitedQueue.add(l);
        }

        throw new RuntimeException("There should be at least one incorrect number!");
    }

    private boolean isSumOfTwo(long n, List<Long> given) {
        for (int i = 0; i < given.size(); i++) {
            for (int j = 0; j < given.size(); j++) {
                if (i == j) {
                    continue;
                }
                long l1 = given.get(i);
                long l2 = given.get(j);
                if (n == l1 + l2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static class LimitedQueue<E> extends LinkedList<E> {
        private final int limit;

        public LimitedQueue(int limit) {
            this.limit = limit;
        }

        @Override
        public boolean add(E o) {
            super.add(o);
            while (size() > limit) { super.remove(); }
            return true;
        }
    }

    public long part2(String input, int preambleLength) {
        long encryptionWeakness = part1(input, preambleLength);
        List<Long> contiguousSet = determineContiguousSet(input, encryptionWeakness);
        return contiguousSet.stream().mapToLong(x -> x).min().getAsLong() + contiguousSet.stream().mapToLong(x -> x).max().getAsLong();
    }

    private List<Long> determineContiguousSet(String input, long sum) {
        List<Long> inputList = Arrays.stream(input.split("\n")).map(Long::parseLong).collect(Collectors.toList());

        for (int i = 0; i < inputList.size(); i++) {
            // Calculate sums from i onwards until we are equal or larger than the sum.
            // If we are equal, return this set. If we are larger, this set isn't it.
            List<Long> answer = new ArrayList<>();
            int counter = 0;
            while (answer.stream().mapToLong(x -> x).sum() < sum) {
                answer.add(inputList.get(i + counter++));
            }

            if (answer.stream().mapToLong(x -> x).sum() == sum && answer.size() > 1) {
                return answer;
            }
        }

        throw new RuntimeException("Could not find any contiguous set");
    }
}
