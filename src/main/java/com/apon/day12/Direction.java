package com.apon.day12;

enum Direction {
    NORTH(0), SOUTH(180), EAST(90), WEST(270);

    public final int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public static Direction fromDegree(int degree) {
        for (Direction direction : Direction.values()) {
            if (direction.degree == degree) {
                return direction;
            }
        }

        throw new RuntimeException("Could not determine direction from degree " + degree);
    }
}
