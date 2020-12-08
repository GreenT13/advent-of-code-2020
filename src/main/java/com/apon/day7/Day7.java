package com.apon.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day7 {
    private final static Pattern LINE_PATTERN = Pattern.compile("(\\w+\\s+\\w+) bags contain (.*)\\.");
    public final static String SHINY_GOLD = "shiny gold";

    public long part1(String input) {
        Map<String, List<Pair>> containsMap = createContainsMap(input);

        return containsMap.keySet().stream()
                .filter(bag -> containsShinyGoldBag(Collections.singletonList(bag), containsMap))
                .count();
    }

    public static boolean containsShinyGoldBag(List<String> bagsToSearch, Map<String, List<Pair>> containsMap) {
        for (String bag : bagsToSearch) {
            if (bag == null) {
                continue;
            }

            List<String> containedBags = containsMap.get(bag).stream().map(x -> x.bag).collect(Collectors.toList());

            if (containedBags.contains(SHINY_GOLD)) {
                return true;
            }

            if (containsShinyGoldBag(containedBags, containsMap)) {
                return true;
            }
        }

        return false;
    }

    public int part2(String input) {
        Map<String, List<Pair>> containsMap = createContainsMap(input);

        return countBagsInside(SHINY_GOLD, containsMap);
    }

    public static int countBagsInside(String bag, Map<String, List<Pair>> containsMap) {
        int total = 0;

        for (Pair insideBag : containsMap.get(bag)) {
            total += insideBag.amount + insideBag.amount * countBagsInside(insideBag.bag, containsMap);
        }

        return total;
    }

    private Map<String, List<Pair>> createContainsMap(String input) {
        Map<String, List<Pair>> containsMap = new HashMap<>();
        for (String line : input.split("\n")) {
            Matcher matcher = LINE_PATTERN.matcher(line);

            if (!matcher.matches()) {
                throw new RuntimeException("Doesn't match line '" + line + "'");
            }

            String bag = matcher.group(1);
            String containedBags = matcher.group(2);
            containsMap.put(bag, new ArrayList<>());

            if ("no other bags".equals(containedBags)) {
                continue;
            }

            for (String containedBagPart : containedBags.split(",")) {
                Matcher containedBagPartMatcher = Pattern.compile("\\s*(\\d+) (\\w+\\s+\\w+) bags?").matcher(containedBagPart);
                if (!containedBagPartMatcher.matches()) {
                    throw new RuntimeException("Doesn't match bag '" + containedBagPart + "' in '" + line + "'");
                }

                containsMap.get(bag).add(new Pair(Integer.parseInt(containedBagPartMatcher.group(1)), containedBagPartMatcher.group(2)));
            }
        }

        return containsMap;
    }

    private static class Pair {
        public final int amount;
        public final String bag;

        public Pair(int amount, String bag) {
            this.amount = amount;
            this.bag = bag;
        }
    }
}
