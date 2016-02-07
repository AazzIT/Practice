package practice001.joincharacters_005;

public class JoinCharacters {
    public static int join(char[] input) {
        int result = 0;
        for (int i = input.length; i > 0; i--) {
            result += (((int) input[input.length - i]) - 48) * Math.pow(10, (i - 1));
        }
        return result;
    }
}
