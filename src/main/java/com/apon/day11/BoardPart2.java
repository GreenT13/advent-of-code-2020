package com.apon.day11;

import java.util.ArrayList;
import java.util.List;

public class BoardPart2 extends BoardPart1 {
    public BoardPart2(char[][] layout) {
        super(layout);
    }

    @Override
    public boolean nextSteps() {
        List<Coordinate> seatsToFill = new ArrayList<>();
        List<Coordinate> seatsToEmpty = new ArrayList<>();
        for (Coordinate coordinate : Coordinate.allCoordinates(width, height)) {
            char c = getFromCoordinate(coordinate);
            if (FLOOR == c) {
                continue;
            }

            long nrOfOccupiedSeatsAround = nrOfOccupiedSeatsVisibleAround(coordinate); // Different
            if (EMPTY_SEAT == c && nrOfOccupiedSeatsAround == 0) {
                seatsToFill.add(coordinate);
            } else if (FILLED_SEAT == c && nrOfOccupiedSeatsAround >= 5) { // Different
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

    private long nrOfOccupiedSeatsVisibleAround(Coordinate coordinate) {
        int nrOfOccupiedSeatsVisibleAround = 0;
        List<List<Coordinate>> coordinateDirections = Coordinate.getCoordinatesInAllDirections(coordinate, width, height);
        for (List<Coordinate> coordinates : coordinateDirections) {
            for (Coordinate direction : coordinates) {
                char c = getFromCoordinate(direction);
                if (EMPTY_SEAT == c) {
                    break;
                } else if (FILLED_SEAT == c) {
                    nrOfOccupiedSeatsVisibleAround++;
                    break;
                }
            }
        }
        return nrOfOccupiedSeatsVisibleAround;
    }
}
