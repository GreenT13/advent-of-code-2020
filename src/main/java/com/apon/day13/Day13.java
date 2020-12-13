package com.apon.day13;

import com.apon.Pair;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day13 {
    public long part1(String input) {
        String[] arrayInput = input.split("\n");
        Long earliestTime = Long.parseLong(arrayInput[0]);

        Pair<Long, Long> earliestBus = Arrays.stream(arrayInput[1].split(","))
                .filter(id -> !id.equals("x"))
                .map(Long::parseLong)
                // Map each busId to the pair (busId, waiting time).
                .map(id -> new Pair<>(id, id - (earliestTime % id)))
                // Find the pair with lowest waiting time (right).
                .min((o1, o2) -> {
                    if (o1.right > o2.right) {
                        return 1;
                    } else if (o1.right < o2.right) {
                        return -1;
                    }
                    return 0;
                }).orElseThrow();

        return earliestBus.left * earliestBus.right;
    }

    public long part2(String input) {
        // Math note: I have checked that all the input integers are pairwise coprime. This makes it possible to use the
        // Chinese Remainder Theorem to find the result. I am using the existence construction (see wiki).

        // Create a list of constraints (n,i), where n is the number of the input and i the position of the number.
        List<Constraint> constraints = new ArrayList<>();
        long counter = 0;
        for (String part : input.split("\n")[1].split(",")) {
            if ("x".equals(part)) {
                counter++;
                continue;
            }
            constraints.add(new Constraint(new BigInteger(part), BigInteger.valueOf(counter)));
            counter++;
        }

        // Merge all the constraints into a single constraint that is only true if and only if all the other constraints are true.
        Constraint mergedConstraint = constraints.stream()
                .reduce(this::mergeConstraints)
                .orElseThrow();

        // The above actually solved the "reversed" exercise. We could have changed the above to solve the actual solution,
        // but we can also just return the reverse to make up for this.
        return mergedConstraint.m.subtract(mergedConstraint.remainder).longValueExact();
    }

    /**
     * Calculates a new constraint, that can only hold if and only if the given constraints hold.
     * @param constraint1 The first constraint.
     * @param constraint2 The second constraint.
     * @return The identical constraint.
     */
    private Constraint mergeConstraints(Constraint constraint1, Constraint constraint2) {
        // Calculate such that values[1] * m1 + values[2] * m2 == values[0].
        // Note that we must have values[0] == 1, otherwise the algorithm doesn't work. It needs coprime values.
        BigInteger[] values = gcd(constraint1.m, constraint2.m);
        if (BigInteger.ONE.compareTo(values[0]) != 0) {
            throw new RuntimeException("The given numbers are not coprime. This method doesn't work!");
        }

        // Calculate solution, which can be any kind of value (also negative or extremely large).
        BigInteger randomSolution = constraint2.remainder.multiply(values[1]).multiply(constraint1.m)
                .add(constraint1.remainder.multiply(values[2]).multiply(constraint2.m));

        // Find the smallest valid solution in the range [0, m1 * m2] such that the constraints still hold.
        BigInteger validSolution = randomSolution.mod(constraint1.m.multiply(constraint2.m));

        boolean isValidForConstraint1 = (validSolution.mod(constraint1.m).compareTo(constraint1.remainder) == 0);
        boolean isValidForConstraint2 = (validSolution.mod(constraint2.m).compareTo(constraint2.remainder) == 0);
        if (!isValidForConstraint1 || !isValidForConstraint2) {
            // This should never happen.
            throw new RuntimeException("The new constraint that we calculated is not valid");
        }

        // Return the new constraint that holds if and only if both constraints hold.
        return new Constraint(constraint1.m.multiply(constraint2.m), validSolution);
    }

    /**
     * @param p First integer.
     * @param q Second integer.
     * @return Array {@code [d, a, b]} such that {@code d = gcd(p, q)} and {@code ap + bq = d}.
     */
    public static BigInteger[] gcd(BigInteger p, BigInteger q) {
        BigInteger x = BigInteger.ZERO;
        BigInteger lastX = BigInteger.ONE;
        BigInteger y = BigInteger.ONE;
        BigInteger lastY = BigInteger.ZERO;
        while (!q.equals(BigInteger.ZERO)) {
            BigInteger[] quotientAndRemainder = p.divideAndRemainder(q);
            BigInteger quotient = quotientAndRemainder[0];

            p = q;
            q = quotientAndRemainder[1];

            BigInteger temp = x;
            x = lastX.subtract(quotient.multiply(x));
            lastX = temp;

            temp = y;
            y = lastY.subtract(quotient.multiply(y));
            lastY = temp;
        }

        return new BigInteger[]{p, lastX, lastY};
    }


    /**
     * Class that represents the constraint {@code Math.floorMod(x,m) == remainder}.
     */
    private static class Constraint {
        public final BigInteger m;
        public final BigInteger remainder;

        public Constraint(BigInteger m, BigInteger remainder) {
            this.m = m;
            // Make sure the remainder is always between 0 and m-1.
            this.remainder = remainder.mod(m);
        }

        @Override
        public String toString() {
            return "Constraint{" +
                    "m=" + m +
                    ", remainder=" + remainder +
                    '}';
        }
    }
}
