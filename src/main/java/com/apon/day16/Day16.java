package com.apon.day16;

import com.apon.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Day16 {
    public long part1(String input) {
        TicketDetails ticketDetails = TicketDetails.part1Of(input);

        // Create a set with ALL possible numbers.
        Set<Long> allPossibleNumbers = ticketDetails.fieldRange.values().stream()
                .reduce(new HashSet<>(), (longs, longs2) -> {
                    longs.addAll(longs2);
                    return longs;
                });

        long ticketScanningErrorRate = 0;
        for (List<Long> ticket : ticketDetails.tickets) {
            for (Long number : ticket) {
                if (!allPossibleNumbers.contains(number)) {
                    ticketScanningErrorRate += number;
                }
            }
        }

        return ticketScanningErrorRate;
    }

    public long part2(String input) {
        TicketDetails ticketDetails = TicketDetails.part2Of(input);
        return calculateAnswer(determinePositionMap(ticketDetails), ticketDetails);
    }


    public Map<String, Integer> determinePositionMap(TicketDetails ticketDetails) {
        // Initialize map with solutions with all fields.
        Map<Integer, Set<String>> possibleSolutions = new HashMap<>();
        for (int i = 0; i < ticketDetails.yourTicket.size(); i++) {
            possibleSolutions.put(i, new HashSet<>(ticketDetails.fieldRange.keySet()));
        }

        // Walk through each ticket and through each position. Filter out the fields that are not possible.
        for (List<Long> ticket : ticketDetails.tickets) {
            for (int i = 0; i < ticket.size(); i++) {
                // Create a copy, so we can modify while looping over the set.
                Set<String> possibleSolutionsLeft = new HashSet<>(possibleSolutions.get(i));
                Long currentValue = ticket.get(i);

                for (String fieldName : possibleSolutionsLeft) {
                    // Remove any field from the list of possible solutions if the found value cannot be of that range.
                    if (!ticketDetails.fieldRange.get(fieldName).contains(currentValue)) {
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
                Set<Pair<String, Set<Integer>>> occurrences = ticketDetails.fieldRange.keySet().stream()
                        .map(_fieldName -> new Pair<>(_fieldName, possibleSolutions.entrySet().stream()
                                .filter(e -> e.getValue().contains(_fieldName))
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

    public long calculateAnswer(Map<String, Integer> positionMap, TicketDetails ticketDetails) {
        return ticketDetails.fieldRange.keySet().stream()
                .filter(fieldName -> fieldName.startsWith("departure"))
                .mapToLong(fieldName -> ticketDetails.yourTicket.get(positionMap.get(fieldName)))
                .reduce((left, right) -> left * right)
                .getAsLong();
    }
}
