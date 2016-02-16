package practice002.positiveaveragenumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositiveAverageNumberTest {

    @Test(timeout = 2000)
    public void testAverage() throws Exception {
        Assert.assertEquals(3, PositiveAverageNumber.average(2, 4));
    }
}