package practice002.averagenumber;

public class AverageNumber {
    public static int average(int a, int b) {
        if ((a == Integer.MIN_VALUE) && (b == Integer.MIN_VALUE)) {
            return Integer.MIN_VALUE;
        }

        if ((a < 0) && (b < 0)) {
            return (a + b) / 2;
        }
        return (a + b)>>>1;
    }
}
