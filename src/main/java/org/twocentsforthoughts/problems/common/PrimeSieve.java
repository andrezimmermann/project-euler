package org.twocentsforthoughts.problems.common;

import java.util.ArrayList;
import java.util.List;

public class PrimeSieve {

    /**
     * Simple implementation of a prime sieve
     * @param limit
     * @return
     */
    public List<Integer> getPrimesUpTo(int upperLimit) {

        // For each number up to the limit
        boolean[] composites = new boolean[upperLimit + 1];

        for (int i = 2; i * i <= upperLimit; i++) {
            if (!composites[i]) {
                for (int j = i; i * j <= upperLimit; j++) {
                    composites[i * j] = true;
                }
            }
        }

        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= upperLimit; i++) {
            if (!composites[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
