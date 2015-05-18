package org.twocentsforthoughts.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem002Test {

    Problem002 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem002();
    }

    @Test
    public void shouldSumEvenFibNumbersUpTo100() {
        long result = problem.sumEvenUpToLimit(50);
        Assert.assertEquals(44, result);
    }

    @Test
    public void shouldSumEvenFibNumbersUpTo4000000() {
        long result = problem.sumEvenUpToLimit(4000000);
        Assert.assertEquals(4613732, result);
    }

}
