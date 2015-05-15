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

    private boolean isMultiple(int i, int targetMultiple) {
        return i % targetMultiple == 0;
    }

    /**
     * Return the sum of numbers within the set, limiting the set of naturals number to look for.
     * @param setMultiple of multiples
     * @param limit of number for the search 0 to including limit
     * @return the sum of numbers
     */
    public int sumMultiples(Set<Integer> setMultiple, int limit) {
        if (setMultiple == null) {
            setMultiple = Collections.EMPTY_SET;
        }

        Set<Integer> setCurrentNumbers = new LinkedHashSet<Integer>();

        for (int currentNumber = 1; currentNumber < limit; currentNumber++) {
            for (Integer multipleOf : setMultiple) {
                if (isMultiple(currentNumber, multipleOf) && !setCurrentNumbers.contains(currentNumber)) {
                    setCurrentNumbers.add(currentNumber);
                    break;
                }
            }
        }

        int result = 0;
        for (Integer number : setCurrentNumbers) {
            result += number;
        }

        return result;
    }

}
