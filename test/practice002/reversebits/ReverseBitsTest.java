package practice002.reversebits;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void testReverse() throws Exception {
        int input = 1073741824;
        Assert.assertEquals(input, ReverseBits.reverse(2));
    }
}