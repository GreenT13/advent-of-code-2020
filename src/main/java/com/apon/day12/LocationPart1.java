package com.apon.day12;

class LocationPart1 {
    private long east = 0;
    private long north = 0;
    private Direction currentDirection = Direction.EAST;

    public void adjustLocation(Action action) {
        switch (action.actionType) {
            case N -> north += action.value;
            case S -> north -= action.value;
            case E -> east += action.value;
            case W -> east -= action.value;
            case L, R -> currentDirection = determineNewDirection(action);
            case F -> moveForward(action.value);
        }
    }

    private Direction determineNewDirection(Action action) {
        if (action.value % 90 != 0) {
            throw new RuntimeException("Degree must be a multiple of 90!");
        }

        // By only adjusting the degree for L and R, this method happens to work for all action types!
        int degree = currentDirection.degree;
        if (ActionType.L == action.actionType) {
            // Add 360 to avoid modulo having negative value (which is possible in Java...).
            degree = (degree - ((int) action.value) + 360) % 360;
        } else if (ActionType.R == action.actionType) {
            degree = (degree + ((int) action.value)) % 360;
        }

        return Direction.fromDegree(degree);
    }

    private void moveForward(long value) {
        switch (currentDirection) {
            case NORTH -> north += value;
            case SOUTH -> north -= value;
            case EAST -> east += value;
            case WEST -> east -= value;
        }
    }

    public long calculateManhattanDistance() {
        return Math.abs(east) + Math.abs(north);
    }
}
