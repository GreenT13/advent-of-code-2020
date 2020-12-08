package com.apon.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Day4 {
    public long part1(String input) {
        return Arrays.stream(input.split("\n\n"))
                .map(Passport::of)
                .filter(Passport::isValidPart1)
                .count();
    }

    public long part2(String input) {
        return Arrays.stream(input.split("\n\n"))
                .map(Passport::of)
                .filter(Passport::isValidPart2)
                .count();
    }

    private static class Passport {
        private final Map<String, String> values;

        private Passport(Map<String, String> values) {
            this.values = values;
        }

        public static Passport of(String passportAsString) {
            Map<String, String> map = new HashMap<>();
            for (String entry : passportAsString.split("( |\\r?\\n)")) {
                String[] block = entry.split(":");
                map.put(block[0], block[1]);
            }

            return new Passport(map);
        }

        public boolean isValidPart1() {
            return values.keySet().containsAll(Arrays.asList("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"));
        }

        public boolean isValidPart2() {
            if (!isValidPart1()) {
                return false;
            }

            int byr = Integer.parseInt(values.get("byr"));
            if (byr < 1920 | byr > 2002) {
                return false;
            }

            int iyr = Integer.parseInt(values.get("iyr"));
            if (iyr < 2010 | iyr > 2020) {
                return false;
            }

            int eyr = Integer.parseInt(values.get("eyr"));
            if (eyr < 2020 | eyr > 2030) {
                return false;
            }

            String hgtString = values.get("hgt");
            if (!hgtString.endsWith("cm") && !hgtString.endsWith("in")) {
                return false;
            }

            int hgt = Integer.parseInt(hgtString.substring(0, hgtString.length() - 2));
            if (hgtString.endsWith("cm") && (hgt < 150 | hgt > 193)) {
                return false;
            } else if (hgtString.endsWith("in") && (hgt < 59 | hgt > 76)) {
                return false;
            }

            String hcl = values.get("hcl");
            Pattern hclPattern = Pattern.compile("#[0-9a-f]{6}");
            if (!hclPattern.matcher(hcl).matches()) {
                return false;
            }

            String ecl = values.get("ecl");
            if (!Arrays.asList("amb", "blu", "brn", "gry", "grn", "hzl", "oth").contains(ecl)) {
                return false;
            }

            String pid = values.get("pid");
            Pattern pidPattern = Pattern.compile("[0-9]{9}");
            if (!pidPattern.matcher(pid).matches()) {
                return false;
            }

            return true;
        }
    }
}
