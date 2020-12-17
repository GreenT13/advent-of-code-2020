package com.apon.day16;

import com.apon.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day16 {
    public long part1(String input) {
        String[] inputArray = input.split("\n\n");
        Set<Long> numbersInRange = parseInputNumbersInRange(inputArray[0]);

        long ticketScanningErrorRate = 0;
        for (String line : inputArray[2].split("\n")) {
            if ("nearby tickets:".equals(line)) {
                continue;
            }

            for (String number : line.split(",")) {
                long n = Long.parseLong(number);
                if (!numbersInRange.contains(n)) {
                    ticketScanningErrorRate += n;
                }
            }
        }

        return ticketScanningErrorRate;
    }

    private Set<Long> parseInputNumbersInRange(String input) {
        Pattern REGEX = Pattern.compile("[a-zA-Z ]+: (\\d+)-(\\d+) or (\\d+)-(\\d+)");
        Set<Long> numbers = new HashSet<>();
        for (String line : input.split("\n")) {
            Matcher matcher = REGEX.matcher(line);
            if (!matcher.matches()) {
                throw new RuntimeException("This should not happen.");
            }

            for (long i = Long.parseLong(matcher.group(1)); i <= Long.parseLong(matcher.group(2)); i++) {
                numbers.add(i);
            }
            for (long i = Long.parseLong(matcher.group(3)); i <= Long.parseLong(matcher.group(4)); i++) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    public long part2(String input) {
        String[] inputArray = input.split("\n\n");

        Map<String, Set<Long>> fieldRange = createFieldRange(inputArray[0]);
        List<Long> yourTicket = createYourTicket(inputArray[1]);
        List<List<Long>> nearbyTickets = createTicketsWithoutYourTicket(inputArray[2]);

        List<List<Long>> validTickets = filterInvalidTickets(nearbyTickets, fieldRange);
        validTickets.add(yourTicket);

        TicketDetails ticketDetails = new TicketDetails(fieldRange, validTickets, yourTicket);
        return ticketDetails.calculateAnswer(ticketDetails.determinePositionMap());
    }

    private List<List<Long>> filterInvalidTickets(List<List<Long>> tickets, Map<String, Set<Long>> fieldRange) {
        List<List<Long>> validTickets = new ArrayList<>();

        // Create a set with ALL possible numbers.
        Set<Long> allPossibleNumbers = fieldRange.values().stream()
                .reduce(new HashSet<>(), (longs, longs2) -> {
                    longs.addAll(longs2);
                    return longs;
                });

        outerloop: for (List<Long> ticket : tickets) {
            for (Long number : ticket) {
                if (!allPossibleNumbers.contains(number)) {
                    continue outerloop;
                }
            }

            validTickets.add(ticket);
        }

        return validTickets;
    }

    private Map<String, Set<Long>> createFieldRange(String input) {
        Pattern REGEX = Pattern.compile("([a-zA-Z ]+): (\\d+)-(\\d+) or (\\d+)-(\\d+)");
        Map<String, Set<Long>> fieldRange = new HashMap<>();
        for (String line : input.split("\n")) {
            Set<Long> numbers = new HashSet<>();
            Matcher matcher = REGEX.matcher(line);
            if (!matcher.matches()) {
                throw new RuntimeException("This should not happen.");
            }

            for (long i = Long.parseLong(matcher.group(2)); i <= Long.parseLong(matcher.group(3)); i++) {
                numbers.add(i);
            }
            for (long i = Long.parseLong(matcher.group(4)); i <= Long.parseLong(matcher.group(5)); i++) {
                numbers.add(i);
            }

            fieldRange.put(matcher.group(1), numbers);
        }

        return fieldRange;
    }

    private List<Long> createYourTicket(String input) {
        return createTicketFromLine(input.split("\n")[1]);
    }

    private List<List<Long>> createTicketsWithoutYourTicket(String input) {
        return Arrays.stream(input.split("\n"))
                .filter(x -> !x.startsWith("nearby"))
                .map(this::createTicketFromLine)
                .collect(Collectors.toList());
    }

    private List<Long> createTicketFromLine(String line) {
        return Arrays.stream(line.split(",")).map(Long::parseLong).collect(Collectors.toList());
    }

    private static class TicketDetails {
        private final Map<String, Set<Long>> fieldRange;
        // Includes your ticket.
        private final List<List<Long>> validTickets;
        private final List<Long> yourTicket;

        public TicketDetails(Map<String, Set<Long>> fieldRange, List<List<Long>> validTickets, List<Long> yourTicket) {
            this.fieldRange = fieldRange;
            this.validTickets = validTickets;
            this.yourTicket = yourTicket;
        }

        public Map<String, Integer> determinePositionMap() {
            // Initialize map with solutions with all fields.
            Map<Integer, Set<String>> possibleSolutions = new HashMap<>();
            for (int i = 0; i < yourTicket.size(); i++) {
                possibleSolutions.put(i, new HashSet<>(fieldRange.keySet()));
            }

            // Walk through each ticket and through each position. Filter out the fields that are not possible.
            for (List<Long> ticket : validTickets) {
                for (int i = 0; i < ticket.size(); i++) {
                    // Create a copy, so we can modify while looping over the set.
                    Set<String> possibleSolutionsLeft = new HashSet<>(possibleSolutions.get(i));
                    Long currentValue = ticket.get(i);

                    for (String fieldName : possibleSolutionsLeft) {
                        // Remove any field from the list of possible solutions if the found value cannot be of that range.
                        if (!fieldRange.get(fieldName).contains(currentValue)) {
                            possibleSolutions.get(i).remove(fieldName);
                        }
                    }
                }
            }

            // Using the information above, we can determine the position of each field with either:
            // 1. The set of solutions for the position contains a single field name.
            // 2. The field name occurs in only one set of solutions for all the positions.
            // If we find a solution that satisfies one of these criteria, we move the solution into the final solutions map
            // and cross of the solution of all the other lists.
            Map<String, Integer> finalSolutions = new HashMap<>();

            while (possibleSolutions.size() > 0) {
                // Variable for the solution we will move to the final solutions.
                Integer fieldPosition;
                String fieldName;

                // Find a solution that satisfies criteria 1.
                Map.Entry<Integer, Set<String>> solutionEntry = possibleSolutions.entrySet().stream()
                        .filter(entry -> entry.getValue().size() == 1)
                        .findAny().orElse(null);

                if (solutionEntry != null) {
                    fieldPosition = solutionEntry.getKey();
                    fieldName = solutionEntry.getValue().iterator().next();
                } else {
                    // If nothing was found, try to find a solution that satisfies criteria 2.
                    Set<Pair<String, Set<Integer>>> occurrences = fieldRange.keySet().stream()
                            .map(x -> new Pair<>(x, possibleSolutions.entrySet().stream()
                                    .filter(e -> e.getValue().contains(x))
                                    .map(Map.Entry::getKey).collect(Collectors.toSet())))
                            .collect(Collectors.toSet());

                    Pair<String, Set<Integer>> solutionPair = occurrences.stream().filter(pair -> pair.right.size() == 1).findAny().orElse(null);

                    if (solutionPair == null) {
                        // We could not determine the rest of the solutions.
                        // Debugging showed that the locations of departure were found for the input, so that is good enough.
                        break;
                    } else {
                        fieldPosition = solutionPair.right.iterator().next();
                        fieldName = solutionPair.left;
                    }
                }

                // Move the solution into the final solutions map.
                possibleSolutions.remove(fieldPosition);
                finalSolutions.put(fieldName, fieldPosition);

                // Cross of this solution for all the other positions.
                for (Map.Entry<Integer, Set<String>> entry : possibleSolutions.entrySet()) {
                    entry.getValue().remove(fieldName);
                }
            }

            return finalSolutions;
        }

        public long calculateAnswer(Map<String, Integer> positionMap) {
            return fieldRange.keySet().stream()
                    .filter(fieldName -> fieldName.startsWith("departure"))
                    .mapToLong(fieldName -> yourTicket.get(positionMap.get(fieldName)))
                    .reduce((left, right) -> left * right)
                    .getAsLong();
        }
    }
}
