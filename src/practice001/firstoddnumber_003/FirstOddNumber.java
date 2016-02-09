package practice001.firstoddnumber_003;

public class FirstOddNumber {
    public static int find(int[] input) {
        for (int indexOddNumber = 0; indexOddNumber < input.length; indexOddNumber++) {
            if ((input[indexOddNumber] % 2) != 0) {
                return indexOddNumber;
            }
        }
        return -1;
    }
}
