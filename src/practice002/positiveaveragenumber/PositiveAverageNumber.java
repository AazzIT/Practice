package practice002.positiveaveragenumber;

public class PositiveAverageNumber {
    public static int average(int a, int b) {
        if ((a % 2 == 0)|| (b % 2 == 0)) {
            return (a >>> 1) + (b >>> 1);
        } else {
            return (a >>> 1) + (b >>> 1) + 1;
        }
    }
}
