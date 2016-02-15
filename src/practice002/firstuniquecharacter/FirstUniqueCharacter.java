package practice002.firstuniquecharacter;

public class FirstUniqueCharacter {
    public static Character find(String s) {
        int lengthS = s.length();
        Character temp = s.charAt(0);
        for (int i = 1; i < lengthS ; i++) {

            if (temp == s.charAt(i)) {

                return ((s.charAt(i+1)));
            } else {
                return null;
            }
        }
        return temp;
    }
}
