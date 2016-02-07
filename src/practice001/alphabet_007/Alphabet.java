package practice001.alphabet_007;

public class Alphabet {
    public static boolean check(String input) {
        for (int i = 0; i < 26; i++) {
            if ((input.indexOf((char) (i + 97)) == -1) && (input.indexOf((char) (i + 65)) == -1)) {
                return false;
            }
        }
        return true;
    }
}
