package practice002.bitspalindrome;

import org.junit.Assert;
import org.junit.Test;

public class BitsPalindromeTest {

    @Test(timeout = 2000)
    public void testIsPalindrome() throws Exception {
        int input = -2147483647;
        Assert.assertEquals(true, BitsPalindrome.isPalindrome(input));
        input = 98304;
        Assert.assertEquals(true, BitsPalindrome.isPalindrome(input));
    }
}