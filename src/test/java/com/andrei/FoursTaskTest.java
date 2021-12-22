package com.andrei;

import org.junit.Assert;
import org.junit.Test;

public class FoursTaskTest {
    @Test
    public void calculate0() {
        int expected = 0;
        int actual = FoursTask.calculate(1, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1() {
        int expected = 0;
        int actual = FoursTask.calculate(1, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate100() {
        int expected = 9009;
        int actual = FoursTask.calculate(100, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1000() {
        int expected = 906609;
        int actual = FoursTask.calculate(1000, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate10000() {
        int expected = 99000099;
        int actual = FoursTask.calculate(10000, 3);
        Assert.assertEquals(expected, actual);
    }


}
