package practice002.firstuniquecharacter;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterTest {

    @Test(timeout = 2000)
    public void testFind() throws Exception {
        char result = FirstUniqueCharacter.find("abdcba");
        Assert.assertEquals('L', result);
    }
}