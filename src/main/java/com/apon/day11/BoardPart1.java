package com.apon.day11;

import java.util.ArrayList;
import java.util.List;

public class BoardPart1 {
    public final static Character EMPTY_SEAT = 'L';
    public final static Character FILLED_SEAT = '#';
    public final static Character FLOOR = '.';

    private final char[][] layout;
    final int width;
    final int height;

    public BoardPart1(char[][] layout) {
        this.layout = layout;
        width = layout[0].length;
        height = layout.length;
    }

    /**
     * Executes all the "Game of Life" steps from the exercise.
     * @return {@code true} if any change to the board has been made.
     */
    public boolean nextSteps() {
        // Determine all the changes.
        List<Coordinate> seatsToFill = new ArrayList<>();
        List<Coordinate> seatsToEmpty = new ArrayList<>();
        for (Coordinate coordinate : Coordinate.allCoordinates(width, height)) {
            char c = getFromCoordinate(coordinate);
            if (FLOOR == c) {
                continue;
            }

            long nrOfOccupiedSeatsAround = nrOfOccupiedSeatsAround(coordinate);
            if (EMPTY_SEAT == c && nrOfOccupiedSeatsAround == 0) {
                seatsToFill.add(coordinate);
            } else if (FILLED_SEAT == c && nrOfOccupiedSeatsAround >= 4) {
                seatsToEmpty.add(coordinate);
            }
        }

        // Execute all the changes.
        for (Coordinate coordinate : seatsToFill) {
            update(coordinate, FILLED_SEAT);
        }
        for (Coordinate coordinate : seatsToEmpty) {
            update(coordinate, EMPTY_SEAT);
        }

        // Return whether or not any changes have been made.
        return seatsToEmpty.size() + seatsToFill.size() > 0;
    }

    private long nrOfOccupiedSeatsAround(Coordinate coordinate) {
        return Coordinate.getCoordinatesAround(coordinate, width, height).stream()
                .map(this::getFromCoordinate)
                .filter(c -> c == FILLED_SEAT)
                .count();
    }

    public long calculateNrOfOccupiedSeats() {
        return Coordinate.allCoordinates(width, height).stream()
                .map(this::getFromCoordinate)
                .filter(c -> c == FILLED_SEAT)
                .count();
    }

    char getFromCoordinate(Coordinate coordinate) {
        return layout[coordinate.i][coordinate.j];
    }

    void update(Coordinate coordinate, char newValue) {
        layout[coordinate.i][coordinate.j] = newValue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] chars : layout) {
            for (char c : chars) {
                stringBuilder.append(c);
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
