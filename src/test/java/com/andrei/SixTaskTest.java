package com.andrei;

import org.junit.Assert;
import org.junit.Test;

public class SixTaskTest {

    @Test
    public void calculate100() {
        int expected = 25164150;
        int actual = SixTask.calculate(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1() {
        int expected = 0;
        int actual = SixTask.calculate(1);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void calculate0() {
        int expected = 0;
        int actual = SixTask.calculate(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate50() {
        int expected = 1582700;
        int actual = SixTask.calculate(50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1000() {
        int expected = 1058313332;
        int actual = SixTask.calculate(1000);
        Assert.assertEquals(expected, actual);
    }

}
