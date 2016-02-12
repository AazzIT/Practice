package practice002.lonelynumber;

import java.util.Arrays;

public class LonelyNumber {
    public static int find(int[] input) {
        Arrays.sort(input);
        if (input[0] != input[1]) {
            return input[0];
        }
        if (input[input.length - 1] != input[input.length - 2]) {
            return input[input.length - 1];
        }
        for (int i = 5; i < input.length - 1; i += 5) {
            if (input[i] != input[i + 1]) {
                return input[i];
            }
        }
        return 0;
    }
}
