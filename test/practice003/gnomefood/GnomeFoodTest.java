package practice003.gnomefood;

import org.junit.Assert;
import org.junit.Test;

public class GnomeFoodTest {

    @Test(timeout = 2000)
    public void testFind() throws Exception {
        int[] gnomesHeight = {5, 7, 6, 9, 4};
        int[] portion = {8, 5, 6, 2, 3};
        int[] result = {4, 2, 1, 0, 3};

        Assert.assertArrayEquals(result, GnomeFood.find(gnomesHeight, portion));

    }

    @Test(timeout = 3)
    public void testFind2() throws Exception {

        int[] gnomesHeight = {3, };
        int[] portion = {9, };
        int[] result = {0, };

        Assert.assertArrayEquals(result, GnomeFood.find(gnomesHeight, portion));

    }
}