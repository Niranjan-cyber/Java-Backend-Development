package com.telusko;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

    @Test
    public void testDivide() {
        Calc c = new Calc();
        int actual = c.divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
