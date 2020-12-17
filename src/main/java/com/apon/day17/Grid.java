package com.apon.day17;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final Set<Coordinate> activeCubes;

    public Grid(Set<Coordinate> activeCubes) {
        this.activeCubes = activeCubes;
    }

    public void doNextStep() {
        // List of all the coordinates that are in scope of executing this algorithm. These are:
        // 1. All the coordinates next to the active cubes.
        // 2. All the active cubes themselves.
        Set<Coordinate> coordinatesToCheck = activeCubes.stream()
                .map(Coordinate::nextToThis)
                .reduce(new HashSet<>(), (a, b) -> {
                    a.addAll(b);
                    return a;
                });
        coordinatesToCheck.addAll(activeCubes);

        Set<Coordinate> coordinatesToMakeActive = new HashSet<>();
        Set<Coordinate> coordinatesToMakeInactive = new HashSet<>();

        for (Coordinate coordinate : coordinatesToCheck) {
            long nrOfActiveCubesAround = coordinate.nextToThis().stream()
                    .filter(activeCubes::contains)
                    .count();

            if (activeCubes.contains(coordinate)) {
                // The coordinate contains an active cube. It only stays active if 2 or 3 cubes around it are active.
                if (nrOfActiveCubesAround != 2 && nrOfActiveCubesAround != 3) {
                    // The cube must become inactive.
                    coordinatesToMakeInactive.add(coordinate);
                }
            } else {
                // The coordinate contains an inactive cube. It becomes active if 3 cubes around it are active.
                if (nrOfActiveCubesAround == 3) {
                    coordinatesToMakeActive.add(coordinate);
                }
            }
        }

        activeCubes.removeAll(coordinatesToMakeInactive);
        activeCubes.addAll(coordinatesToMakeActive);
    }

    public long getNrOfActiveCubes() {
        return activeCubes.size();
    }
}
