package com.apon.day17;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FourDimCoordinate implements Coordinate {
    public final int x;
    public final int y;
    public final int z;
    public final int w;

    public FourDimCoordinate(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public Set<Coordinate> nextToThis() {
        Set<Coordinate> coordinatesNexToThis = new HashSet<>();
        for (int deltaX = -1; deltaX <= 1; deltaX++) {
            for (int deltaY = -1; deltaY <= 1; deltaY++) {
                for (int deltaZ = -1; deltaZ <= 1; deltaZ++) {
                    for (int deltaW = -1; deltaW <= 1; deltaW++) {
                        if (deltaX == 0 && deltaY == 0 && deltaZ == 0 && deltaW == 0) {
                            continue;
                        }

                        coordinatesNexToThis.add(new FourDimCoordinate(x + deltaX, y + deltaY, z + deltaZ, w + deltaW));
                    }
                }
            }
        }
        return coordinatesNexToThis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FourDimCoordinate that = (FourDimCoordinate) o;
        return x == that.x &&
                y == that.y &&
                z == that.z &&
                w == that.w;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, w);
    }
}
