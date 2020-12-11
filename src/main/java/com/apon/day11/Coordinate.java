package com.apon.day11;

import java.util.ArrayList;
import java.util.List;

public class Coordinate {
    public final int i;
    public final int j;

    public Coordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }

    /**
     * @param width  The width of the layout.
     * @param height The height of the layout.
     * @return List of all the coordinates on a layout with given width and height.
     */
    public static List<Coordinate> allCoordinates(int width, int height) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                coordinates.add(new Coordinate(i, j));
            }
        }
        return coordinates;
    }

    /**
     * @param coordinate The coordinate in the middle.
     * @param width      The width of the layout.
     * @param height     The height of the layout.
     * @return List of all the valid coordinates around the given coordinate.
     */
    public static List<Coordinate> getCoordinatesAround(Coordinate coordinate, int width, int height) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (int deltaI = -1; deltaI <= 1; deltaI++) {
            for (int deltaJ = -1; deltaJ <= 1; deltaJ++) {
                int newI = coordinate.i + deltaI;
                int newJ = coordinate.j + deltaJ;
                // Skip invalid indices.
                if (newI < 0 || newI >= height || newJ < 0 || newJ >= width) {
                    continue;
                }
                // Skip the given coordinate itself.
                if (deltaI == 0 && deltaJ == 0) {
                    continue;
                }

                coordinates.add(new Coordinate(newI, newJ));
            }
        }

        return coordinates;
    }

    /**
     * @param coordinate The starting coordinate.
     * @param width      The width of the board.
     * @param height     The height of the board.
     * @return A list of coordinates, where each list is a direction (up, down, left, right, diagonal) without the
     * starting coordinate going to one of the directions. If there is no way to move that direction (for example, in
     * corners), no list will be added. All lists will have at least one element.
     */
    public static List<List<Coordinate>> getCoordinatesInAllDirections(Coordinate coordinate, int width, int height) {
        List<List<Coordinate>> allDirections = new ArrayList<>();
        for (int deltaI = -1; deltaI <= 1; deltaI++) {
            for (int deltaJ = -1; deltaJ <= 1; deltaJ++) {
                // Skip the given coordinate itself.
                if (deltaI == 0 && deltaJ == 0) {
                    continue;
                }

                List<Coordinate> coordinates = new ArrayList<>();
                int lambda = 1;
                int newI = coordinate.i + deltaI;
                int newJ = coordinate.j + deltaJ;


                while(isValidCoordinate(newI, newJ, width, height)) {
                    coordinates.add(new Coordinate(newI, newJ));
                    lambda++;
                    newI = coordinate.i + lambda * deltaI;
                    newJ = coordinate.j + lambda * deltaJ;
                }

                if (coordinates.size() > 0) {
                    allDirections.add(coordinates);
                }
            }
        }

        return allDirections;
    }

    private static boolean isValidCoordinate(int i, int j, int width, int height) {
        return !(i < 0 || i >= height || j < 0 || j >= width);
    }
}
