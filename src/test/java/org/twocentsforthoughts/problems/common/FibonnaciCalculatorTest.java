package org.twocentsforthoughts.problems.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonnaciCalculatorTest {

    private FibonnaciCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new FibonnaciCalculator();
    }

    @Test
    public void testIfIsCalculatingProperly() {
        // Some random term calculation, see
        // http://www.miniwebtool.com/list-of-fibonacci-numbers/?number=100

        Assert.assertEquals(610, calculator.calculateTerm(15));
        Assert.assertEquals(55, calculator.calculateTerm(10));
        Assert.assertEquals(233, calculator.calculateTerm(13));
        Assert.assertEquals(28657, calculator.calculateTerm(23));
        Assert.assertEquals(433494437, calculator.calculateTerm(43));
        Assert.assertEquals(144, calculator.calculateTerm(12));
        Assert.assertEquals(1, calculator.calculateTerm(1));
        Assert.assertEquals(0, calculator.calculateTerm(0));

    }

}
