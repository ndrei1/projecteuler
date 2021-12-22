package com.andrei;

import org.junit.Assert;
import org.junit.Test;

public class SecondTaskTest {

    @Test
    public void calculate4613732() {
        int expected = 4613732;
        int actual = SecondTask.calculate(4000000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate40() {
        int expected = 44;
        int actual = SecondTask.calculate(50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1() {
        int expected = 0;
        int actual = SecondTask.calculate(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate0() {
        int expected = 0;
        int actual = SecondTask.calculate(0);
        Assert.assertEquals(expected, actual);
    }

}