package com.apon.day15;

import java.util.HashMap;
import java.util.Map;

public class Day15 {

    public long part1(String input) {
        return runAlgorithm(input, 2020);
    }

    public int part2(String input) {
        return runAlgorithm(input, 30000000);
    }

    private int runAlgorithm(String input, int turn) {
        Map<Integer, Integer> mapNumberMostRecentTurn = new HashMap<>();

        int currentTurn = 1;
        for (String inputNumber : input.split(",")) {
            Integer currentNumber = Integer.parseInt(inputNumber);
            mapNumberMostRecentTurn.put(currentNumber, currentTurn);

            currentTurn++;
        }

        // The starting input never repeats a number, so we know that the next step is always 0.
        Integer numberPreviousTurn = 0;
        currentTurn++;


        while (currentTurn <= turn) {
            int numberToSay;
            if (!mapNumberMostRecentTurn.containsKey(numberPreviousTurn)) {
                numberToSay = 0;
            } else {
                numberToSay = currentTurn - mapNumberMostRecentTurn.get(numberPreviousTurn) - 1;
            }

            mapNumberMostRecentTurn.put(numberPreviousTurn, currentTurn - 1);

            currentTurn++;
            numberPreviousTurn = numberToSay;
        }

        return numberPreviousTurn;
    }
}
