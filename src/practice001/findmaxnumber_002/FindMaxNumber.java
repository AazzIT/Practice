package practice001.findmaxnumber_002;

public class FindMaxNumber {
    public static int max(int[] input) {
        int number = Integer.MIN_VALUE;
        for (int anInput : input) {
            if (anInput > number) {
                number = anInput;
            }
        }
        return number;
    }
}
