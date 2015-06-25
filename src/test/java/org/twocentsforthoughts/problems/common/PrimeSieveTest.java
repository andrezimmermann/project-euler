package org.twocentsforthoughts.problems.common;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrimeSieveTest {

    private PrimeSieve primeSieve;

    @Before
    public void setUp() throws Exception {
        primeSieve = new PrimeSieve();
    }

    @Test
    public void test() {
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        List<Integer> primesUpTo = primeSieve.getPrimesUpTo(30);

        Assert.assertEquals(expectedPrimes, primesUpTo);

    }

}
