package practice003.reversePolishNotation;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {

    @Test
    public void testEvaluate() throws Exception {
        String inputPolishExpression = "1 2 +";
        ReversePolishNotation result = new ReversePolishNotation();
        Assert.assertEquals(3, result.evaluate(inputPolishExpression));
    }
}