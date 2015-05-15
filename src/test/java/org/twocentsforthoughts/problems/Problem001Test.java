package org.twocentsforthoughts.problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see https://projecteuler.net/problem=1
 * @author Andre
 *
 */
public class Problem001Test {

    @Test
    public void shouldReturnSum233168Below1000() {
        // Awnser
        Problem001 problem = new Problem001();
        int actual = problem.sumAllMultiples3And5(1000);
        Assert.assertEquals(233168, actual);
    }

    @Test
    public void shouldReturnSum23Below10() {
        Problem001 problem = new Problem001();
        int actual = problem.sumAllMultiples3And5(10);
        Assert.assertEquals(23, actual);
    }

}
