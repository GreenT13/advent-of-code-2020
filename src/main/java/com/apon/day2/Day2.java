package com.apon.day2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 {

    public long part1(String input) {
        return Arrays.stream(input.split("\n"))
                .map(Line::of)
                .filter(Line::isValidForPart1)
                .count();
    }

    public long part2(String input) {
        return Arrays.stream(input.split("\n"))
                .map(Line::of)
                .filter(Line::isValidForPart2)
                .count();
    }

    private static class Line {
        private final static Pattern LINE_PATTERN = Pattern.compile("(\\d+)-(\\d+) ([a-z]): ([a-z]+)");

        public int min;
        public int max;
        public char charToCount;
        public String content;

        public Line(int min, int max, char charToCount, String content) {
            this.min = min;
            this.max = max;
            this.charToCount = charToCount;
            this.content = content;
        }

        public static Line of(String line) {
            Matcher matcher = LINE_PATTERN.matcher(line);
            if (!matcher.matches()) {
                throw new RuntimeException("Cannot match the following input: '" + line + "'");
            }

            int min = Integer.parseInt(matcher.group(1));
            int max = Integer.parseInt(matcher.group(2));
            char charToCount = matcher.group(3).toCharArray()[0];
            String content = matcher.group(4);

            return new Line(min, max, charToCount, content);
        }

        public boolean isValidForPart1() {
            long charCount = content.chars().filter(ch -> ch == charToCount).count();
            return min <= charCount && charCount <= max;
        }

        public boolean isValidForPart2() {
            char firstPositionChar = content.charAt(min - 1);
            char secondPositionChar = content.charAt(max - 1);

            return (firstPositionChar == charToCount && secondPositionChar != charToCount) ||
                    (firstPositionChar != charToCount && secondPositionChar == charToCount);
        }
    }
}
