package practice002.lonelynumber;

import java.util.Arrays;

public class LonelyNumber {
    public static int find(int[] input) {
        int[] sums = new int[32];
        int number;
        int mask;
        for (int i = 0; i < input.length; i++) {
            number = input[i];
            for (int j = 0; j < 32; j++) {
                mask = 1 << j;
                if ((number & mask) != 0) {
                    sums[j] += 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += sums[31 - i] % 5;
        }
        return result;

        /*

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
        return 0; */
    }
}
