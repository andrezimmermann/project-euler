package org.twocentsforthoughts.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem003Test {

    private Problem003 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem003();
    }

    @Test
    public void shouldGetBiggestPrimeFactorOf13195() {
        long result = problem.getBiggestPrimeFactorOf(13195);
        Assert.assertEquals(29, result);
    }

    @Test
    public void shouldGetBiggestPrimeFactorOf600851475143() {
        long result = problem.getBiggestPrimeFactorOf(600851475143l);
        Assert.assertEquals(6857, result);
    }

}
