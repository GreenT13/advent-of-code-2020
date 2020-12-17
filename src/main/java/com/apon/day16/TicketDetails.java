package com.apon.day16;

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

public class TicketDetails {
    /** Keys are field names and values are a list of ALL numbers that are possible for that field. */
    public final Map<String, Set<Long>> fieldRange;
    /** Will include your ticket! */
    public final List<List<Long>> tickets;
    public final List<Long> yourTicket;

    private TicketDetails(Map<String, Set<Long>> fieldRange, List<List<Long>> tickets, List<Long> yourTicket) {
        this.fieldRange = fieldRange;
        this.tickets = tickets;
        this.yourTicket = yourTicket;
    }

    public static TicketDetails part1Of(String input) {
        String[] inputArray = input.split("\n\n");
        Map<String, Set<Long>> fieldRange = createFieldRange(inputArray[0]);
        List<Long> yourTicket = createYourTicket(inputArray[1]);
        List<List<Long>> nearbyTickets = createTicketsWithoutYourTicket(inputArray[2]);

        return new TicketDetails(fieldRange, nearbyTickets, yourTicket);
    }

    public static TicketDetails part2Of(String input) {
        TicketDetails ticketDetailsPart1 = part1Of(input);

        // Filter the invalid tickets from the list and return an object with only the valid tickets.
        List<List<Long>> validTickets = filterInvalidTickets(ticketDetailsPart1.tickets, ticketDetailsPart1.fieldRange);
        return new TicketDetails(ticketDetailsPart1.fieldRange, validTickets, ticketDetailsPart1.yourTicket);
    }

    private static Map<String, Set<Long>> createFieldRange(String firstInput) {
        Pattern REGEX = Pattern.compile("([a-zA-Z ]+): (\\d+)-(\\d+) or (\\d+)-(\\d+)");
        Map<String, Set<Long>> fieldRange = new HashMap<>();
        for (String line : firstInput.split("\n")) {
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

    private static List<Long> createYourTicket(String middleInput) {
        return createTicketFromLine(middleInput.split("\n")[1]);
    }

    private static List<List<Long>> createTicketsWithoutYourTicket(String lastInput) {
        return Arrays.stream(lastInput.split("\n"))
                .filter(x -> !x.startsWith("nearby"))
                .map(TicketDetails::createTicketFromLine)
                .collect(Collectors.toList());
    }

    private static List<List<Long>> filterInvalidTickets(List<List<Long>> tickets, Map<String, Set<Long>> fieldRange) {
        List<List<Long>> validTickets = new ArrayList<>();

        // Create a set with ALL possible numbers.
        Set<Long> allPossibleNumbers = fieldRange.values().stream()
                .reduce(new HashSet<>(), (longs, longs2) -> {
                    longs.addAll(longs2);
                    return longs;
                });

        outerloop:
        for (List<Long> ticket : tickets) {
            for (Long number : ticket) {
                if (!allPossibleNumbers.contains(number)) {
                    continue outerloop;
                }
            }

            validTickets.add(ticket);
        }

        return validTickets;
    }

    private static List<Long> createTicketFromLine(String line) {
        return Arrays.stream(line.split(",")).map(Long::parseLong).collect(Collectors.toList());
    }

}
