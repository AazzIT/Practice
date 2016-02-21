package practice003.doubles;

import org.junit.Assert;
import org.junit.Test;

import org.hamcrest.CoreMatchers.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DoublesTest {

    @Test(timeout = 2000)
    public void checkNumbers() throws Exception {
        Double actual = new Doubles().parse("12");
        Assert.assertThat(actual, is(12.0));
    }
}