package practice001.sumdigits_001;

public class SumDigits {
    public static int sum(int number) {
        int result = 0;
        String temp = ((Integer) number).toString().replace("-", "");
        for (int i = 0; i < temp.length(); i++) {
            result += ((int) temp.charAt(i) - 48);

        }
        return result;
    }
}
