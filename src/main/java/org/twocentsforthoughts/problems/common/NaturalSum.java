package org.twocentsforthoughts.problems.common;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Extracted the Problem 1 logic into this class, can be reused to another set of multiples
 * @author Andre
 *
 */
public class NaturalSum {

    private boolean isAlreadyInResultSet(Set<Integer> set, int value) {
        return !set.contains(value);
    }

    private boolean isMultiple(int number, int targetMultiple) {
        return number % targetMultiple == 0;
    }

    /**
     * Return the sum of numbers within the set, limiting the set of naturals number to look for.
     * @param multiples of multiples
     * @param limit of number for the search 0 to including limit
     * @return the sum of numbers
     */
    public int sumMultiples(Set<Integer> multiples, int limit) {
        if (multiples == null) {
            multiples = Collections.EMPTY_SET;
        }

        Set<Integer> resultSet = new LinkedHashSet<Integer>();

        for (Integer multipleOf : multiples) {
            for (int currentNumber = 1; currentNumber < limit; currentNumber++) {
                if (isAlreadyInResultSet(resultSet, currentNumber) && isMultiple(currentNumber, multipleOf)) {
                    resultSet.add(currentNumber);
                }
            }
        }

        int result = 0;
        for (Integer number : resultSet) {
            result += number;
        }

        return result;
    }

}
