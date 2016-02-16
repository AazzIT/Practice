package practice002.firstuniquecharacter;

public class FirstUniqueCharacter {
    public static Character find(String s) {
        int lengthS = s.length();
        String result = s;
        char temp = s.charAt(0);
        int y = 0;
        for (int i=0; i < lengthS; i++) {
            for (int j=0; j < lengthS; j++) {
                y = 0;
                if (s.charAt(i) == s.charAt(j) && i!=j) {
                    y = 1;
                    break;
                }
            }
            if (y == 0) {
                temp = s.charAt(i);
                break;
            }
        }
        if (y == 0) {
            return Character.valueOf(temp);
        } else {
            return null;
        }
    }
}
