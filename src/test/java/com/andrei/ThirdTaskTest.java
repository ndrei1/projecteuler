package com.andrei;

import org.junit.Assert;
import org.junit.Test;


public class ThirdTaskTest {

    @Test
    public void calculate6857() {
        int expected = 6857;
        int actual = ThirdTask.calculate(600851475143L);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate1() {
        int expected = 1;
        int actual = ThirdTask.calculate(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate0() {
        int expected = 0;
        int actual = ThirdTask.calculate(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate13() {
        int expected = 13;
        int actual = ThirdTask.calculate(13);
        Assert.assertEquals(expected, actual);
    }
}