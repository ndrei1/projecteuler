package com.andrei;

import org.junit.Assert;
import org.junit.Test;

public class SevenTaskTest {

    @Test
    public void calculate10001() {
        int expected = 104743;
        int actual = SevenTask.calculate(10001);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculate100() {
        int expected = 541;
        int actual = SevenTask.calculate(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate0() {
        int expected = 0;
        int actual = SevenTask.calculate(0);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculate2() {
        int expected = 2;
        int actual = SevenTask.calculate(1);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void calculate22() {
        int expected = 79;
        int actual = SevenTask.calculate(22);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate100000() {
        int expected = 1299709;
        int actual = SevenTask.calculate(100000);
        Assert.assertEquals(expected, actual);
    }

}
