package com.apon.day12;

public class LocationPart2 {
    private long shipEast = 0;
    private long shipNorth = 0;
    private long waypointEast = 10;
    private long waypointNorth = 1;

    public void adjustLocation(Action action) {
        switch (action.actionType) {
            case N -> waypointNorth += action.value;
            case S -> waypointNorth -= action.value;
            case E -> waypointEast += action.value;
            case W -> waypointEast -= action.value;
            case L, R -> turnWaypoint(action);
            case F -> moveForward(action.value);
        }
    }

    private void moveForward(long value) {
        shipEast += waypointEast * value;
        shipNorth += waypointNorth * value;
    }

    private void turnWaypoint(Action action) {
        // Calculate the number of degrees we move clockwise. This makes the turning part easier to program.
        long degreeToTurn = action.value;
        if (ActionType.L == action.actionType) {
            degreeToTurn = ((-1 * degreeToTurn) + 360) % 360;
        }

        // Will never happen with valid input, just in case.
        if (degreeToTurn % 90 != 0 || degreeToTurn < 0) {
            throw new RuntimeException("Degree to turn must be a multiple of 90!");
        }

        // I calculated how to turn 90 degrees. To make it less error prone, I just repeat this case!
        while (degreeToTurn > 0) {
            long oldWaypointEast = waypointEast;
            waypointEast = waypointNorth;
            waypointNorth = -1 * oldWaypointEast;
            degreeToTurn -= 90;
        }
    }

    public long calculateManhattanDistance() {
        return Math.abs(shipEast) + Math.abs(shipNorth);
    }
}
