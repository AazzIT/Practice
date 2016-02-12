package practice002.lonelynumber;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] input =  {12, 12, 12, 12, 12,
                        14, 14, 14, 14, 14,
                        23,
                        34, 34, 34, 34, 34};
        System.out.println(Arrays.asList(LonelyNumber.find(input)));
    }
}
