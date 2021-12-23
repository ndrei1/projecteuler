package project_euler;

import org.junit.Assert;
import org.junit.Test;

public class FirstTaskTest {
    @Test
    public void calculate1000() {
        int expected = 233168;
        int actual = FirstTask.calculate(1000,3,5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculate0() {
        int expected = 0;
        int actual = FirstTask.calculate(0,3,5);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void calculate1() {
        int expected = 1;
        int actual = FirstTask.calculate(1000,3,5);
        Assert.assertNotEquals(expected, actual);
    }
}