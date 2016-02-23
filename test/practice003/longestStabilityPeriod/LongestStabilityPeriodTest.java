package practice003.longestStabilityPeriod;

import org.junit.Assert;
import org.junit.Test;

public class LongestStabilityPeriodTest {

    @Test(timeout = 2000)
    public void testCount() throws Exception {
        LongestStabilityPeriod periodStability = new LongestStabilityPeriod();
        int result = periodStability.count(new int[]{1, 2, 3, 2, 2, 1});
        Assert.assertEquals(4, result);
    }

    @Test(timeout = 2000)
    public void testCount1() throws Exception {
        LongestStabilityPeriod periodStability = new LongestStabilityPeriod();
        int result = periodStability.count(new int[]{1000,});
        Assert.assertEquals(1, result);
    }

    @Test(timeout = 2000)
    public void testCount2() throws Exception {
        LongestStabilityPeriod periodStability = new LongestStabilityPeriod();
        int result = periodStability.count(new int[]{900, 901, 902, 903, 904, 904, 904, 904, 904, 904, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 904, 904, 904, 904, 904, 904, 904, 904, 904, 904, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, });
        Assert.assertEquals(90, result);
    }
}