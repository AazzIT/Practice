package practice002.lonelynumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LonelyNumberTest {

    @Test(timeout = 2000)
    public void testFind() throws Exception {
        int[] input =  {12, 12, 12, 12, 12,
                14, 14, 14, 14, 14,
                23,
                34, 34, 34, 34, 34};
        Assert.assertEquals(23, LonelyNumber.find(input));
    }
}