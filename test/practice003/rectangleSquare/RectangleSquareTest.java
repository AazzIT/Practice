package practice003.rectangleSquare;

import org.junit.Test;

public class RectangleSquareTest {

    @Test(timeout = 2000)
    public void testMeasure() throws Exception {
        int[] x = {0, 0, };
        int[] h = {20, 10, };
        int[] w = {10, 20, };
        RectangleSquare FullSquare = new RectangleSquare();
        org.junit.Assert.assertEquals(300, FullSquare.measure(x, h, w));
    }
}