package org.twocentsforthoughts.problems;

import java.util.HashSet;
import java.util.Set;

import org.twocentsforthoughts.problems.common.NaturalSum;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see https://projecteuler.net/problem=1
 * @author Andre
 *
 */
public class Problem001 {

    private Set<Integer> getMultipliesOf() {
        Set<Integer> collectionNumbers = new HashSet<Integer>();
        collectionNumbers.add(3);
        collectionNumbers.add(5);
        return collectionNumbers;
    }

    public int sumAllMultiples3And5(int limit) {
        NaturalSum naturalSum = new NaturalSum();

        Set<Integer> collectionNumbers = getMultipliesOf();
        return naturalSum.sumMultiples(collectionNumbers, limit);
    }

}
