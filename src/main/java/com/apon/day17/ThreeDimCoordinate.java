package com.apon.day17;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ThreeDimCoordinate implements Coordinate {
    public final int x;
    public final int y;
    public final int z;

    public ThreeDimCoordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Set<Coordinate> nextToThis() {
        Set<Coordinate> coordinatesNexToThis = new HashSet<>();
        for (int deltaX = -1; deltaX <= 1; deltaX++) {
            for (int deltaY = -1; deltaY <= 1; deltaY++) {
                for (int deltaZ = -1; deltaZ <= 1; deltaZ++) {
                    if (deltaX == 0 && deltaY == 0 && deltaZ == 0) {
                        continue;
                    }

                    coordinatesNexToThis.add(new ThreeDimCoordinate(x + deltaX, y + deltaY, z + deltaZ));
                }
            }
        }
        return coordinatesNexToThis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeDimCoordinate that = (ThreeDimCoordinate) o;
        return x == that.x &&
                y == that.y &&
                z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
