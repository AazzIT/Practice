package practice003.doubles;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DoublesTest {

    @Test(timeout = 2000)
    public void checkNumbers() throws Exception {
        Double actual = new Doubles().parse("125");
        Assert.assertThat(actual, is(125.0));
    }

    @Test(timeout = 2000)
    public void checkNegativeSign() throws Exception {
        Double actual = new Doubles().parse("-125");
        Assert.assertThat(actual, is(-125.0));
    }

    @Test(timeout = 2000)
    public void checkPositiveSignAndPoint() throws Exception {
        Double actual = new Doubles().parse("+125.");
        Assert.assertThat(actual, is(+125.0));
    }

    @Test(timeout = 2000)
    public void checkDecimalPart() throws Exception {
        Double actual = new Doubles().parse("125.256");
        Assert.assertThat(actual, is(125.256));
    }

    @Test(timeout = 2000)
    public void checkOnlyDecimalPart() throws Exception {
        Double actual = new Doubles().parse(".125");
        Assert.assertThat(actual, is(0.125));
    }

    @Test(timeout = 2000)
    public void checkOnlyDot() throws Exception {
        Double actual = new Doubles().parse(".");
        Assert.assertNull(actual);
    }

    @Test(timeout = 2000)
    public void checkExpPart() throws Exception {
        Double actual = new Doubles().parse("2.e2");
        Assert.assertThat(actual, is(2.e2));
    }

    @Test(timeout = 2000)
    public void checkComplexNumberInput() throws Exception {
        Double actual = new Doubles().parse("-.56e-2");
        Assert.assertThat(actual, is(-.56e-2));
    }
}