package org.twocentsforthoughts.problems;

import java.util.ArrayList;
import java.util.List;

import org.twocentsforthoughts.problems.common.PrimeSieve;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * <p>What is the largest prime factor of the number 600851475143 ?</p>
 * @see https://projecteuler.net/problem=3
 * @author Andre
 *
 */
public class Problem003 {

    /**
     *
     * @param n the integer to be factored
     * @return the biggest integer, 0 if no prime
     */
    public long getBiggestPrimeFactorOf(long n) {

        List<Long> primesFound = getPrimesFactorsOf(n);

        // Get last prime factor , it is the biggest

        if (!primesFound.isEmpty()) {
            return primesFound.get(primesFound.size() - 1);
        } else {
            return 0;
        }

    }

    private List<Integer> getPrimes(long numberToBeFactored) {
        PrimeSieve primeSieve = new PrimeSieve();
        List<Integer> primesSieved = primeSieve.getPrimesUpTo((int) (Math.pow(numberToBeFactored, 0.5) + 1));
        return primesSieved;
    }

    /**
     * Return a ordered list of the primes factors
     * @param numberToBeFactored
     * @return a ordered list of the numbers
     */
    private List<Long> getPrimesFactorsOf(long numberToBeFactored) {
        List<Integer> primesSieved = getPrimes(numberToBeFactored);

        List<Long> primesFound = new ArrayList<Long>(primesSieved.size());

        for (int i = 0; i < primesSieved.size(); i++) {
            Integer p = primesSieved.get(i);

            if (p * p > numberToBeFactored) {
                break;
            }
            while (numberToBeFactored % p == 0) {
                primesFound.add((long) p);
                numberToBeFactored /= p;
            }
        }

        if (numberToBeFactored > 1) {
            primesFound.add(numberToBeFactored);
        }
        return primesFound;
    }

}
