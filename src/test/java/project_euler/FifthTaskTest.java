package project_euler;

import org.junit.Assert;
import org.junit.Test;

public class FifthTaskTest {
    @Test
    public void calculate1to20() {
        int expected = 232792560;
        int actual = FifthTask.calculate();
        Assert.assertEquals(expected, actual);
    }
}
