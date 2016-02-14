package practice002.addnumberbase36;

import java.util.HashMap;
import java.util.Map;

public class AddNumberBase36 {
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int tempMemory = 0;
        Map<Character, Integer> abc = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            abc.put((char) ('0' + i), i);
        }
        for (int i = 0; i < 26; i++) {
            abc.put((char) ('A' + i), i);
            abc.put((char) ('a' + i), i);
        }

        for (int i = 0; (i < aLength) || (i < bLength); i++) {
            char aTemp = (i < aLength) ? a.charAt(aLength - (i + 1)) : '0';
            char bTemp = (i < bLength) ? a.charAt(bLength - (i + 1)) : '0';
            int sum = tempMemory + abc.get(aTemp) + abc.get(bTemp);
            if (sum < 36) {
                result.append(fromInt(sum));
                tempMemory = 0;
            } else {
                result.append(fromInt(sum % 36));
                tempMemory = 1;
            }

        }
        if (tempMemory == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }

    public static char fromInt(int num) {
        if (num < 10) {
            return (char) ('0' + num);
        } else {
            return (char) ('a' + num - 10);
        }
    }

}
