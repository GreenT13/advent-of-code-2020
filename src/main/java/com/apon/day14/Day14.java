package com.apon.day14;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day14 {
    public long part1(String input) {
        Map<Long, Long> memory = new HashMap<>();
        String mask = null;

        for (String line : input.split("\n")) {
            if (line.startsWith("mask")) {
                mask = line.substring(line.lastIndexOf(" ") + 1);
                // Initialize the mask.
                continue;
            }

            // It is an instruction, execute it.
            Instruction instruction = Instruction.of(line);
            long number = determineNumberToWriteToMemory(instruction.numberToStore, mask);
            memory.put(instruction.memoryLocation, number);
        }

        return memory.values().stream().mapToLong(x -> x).sum();
    }

    private long determineNumberToWriteToMemory(long number, String mask) {
        String numberAsBinary = StringUtils.leftPad(Long.toBinaryString(number), mask.length(), "0");
        List<Character> newNumber = new ArrayList<>();

        // Copy the mask over the number.
        for (int i = 0; i < numberAsBinary.length(); i++) {
            if (mask.charAt(i) == 'X') {
                newNumber.add(numberAsBinary.charAt(i));
            } else {
                newNumber.add(mask.charAt(i));
            }
        }

        return Long.valueOf(newNumber.stream().map(Object::toString).collect(Collectors.joining()), 2);
    }

    private static class Instruction {
        private final static Pattern REGEX = Pattern.compile("mem\\[(\\d+)] = (\\d+)");

        public final long memoryLocation;
        public final long numberToStore;

        public Instruction(long memoryLocation, long numberToStore) {
            this.memoryLocation = memoryLocation;
            this.numberToStore = numberToStore;
        }

        public static Instruction of(String line) {
            Matcher matcher = REGEX.matcher(line);
            if (!matcher.matches()) {
                throw new RuntimeException("The line doesn't match an instruction: " + line);
            }

            return new Instruction(Long.parseLong(matcher.group(1)), Long.parseLong(matcher.group(2)));
        }
    }

    public long part2(String input) {
        Map<Long, Long> memory = new HashMap<>();
        String mask = null;

        for (String line : input.split("\n")) {
            if (line.startsWith("mask")) {
                mask = line.substring(line.lastIndexOf(" ") + 1);
                // Initialize the mask.
                continue;
            }

            // It is an instruction, execute it.
            Instruction instruction = Instruction.of(line);
            for (Long memoryLocation : determineMemoryLocations(instruction.memoryLocation, mask)) {
                memory.put(memoryLocation, instruction.numberToStore);
            }
        }

        return memory.values().stream().mapToLong(x -> x).sum();
    }

    private List<Long> determineMemoryLocations(long memoryLocation, String mask) {
        String numberAsBinary = StringUtils.leftPad(Long.toBinaryString(memoryLocation), mask.length(), "0");
        List<Character> newNumber = new ArrayList<>();

        // Copy the mask over the number.
        for (int i = 0; i < numberAsBinary.length(); i++) {
            if (mask.charAt(i) == '0') {
                newNumber.add(numberAsBinary.charAt(i));
            } else {
                newNumber.add(mask.charAt(i));
            }
        }

        // New number still has X inside them. We have to create a list of all possibilities.
        return replaceX(new ArrayList<>(), newNumber.stream().map(Object::toString).collect(Collectors.joining()))
                .stream().map(x -> Long.valueOf(x, 2)).collect(Collectors.toList());
    }

    private List<String> replaceX(List<String> result, String number) {
        int index = number.indexOf('X');

        if (index >= 0) {
            String numberWith1 = number.replaceFirst("X", "1");
            String numberWith0 = number.replaceFirst("X", "0");
            replaceX(result, numberWith1);
            replaceX(result, numberWith0);
        } else {
            result.add(number);
        }

        return result;
    }
}
