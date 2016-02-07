package practice001.abcnumber_006;

public class AbcNumber {
    public static int convert(String num) {
        int result = 0;
        for (int i = num.length(); i > 0; i--) {
            result += (((int) num.charAt(num.length() - i)) - 97) * Math.pow(10, (i - 1));
        }
        return result;
    }
}
