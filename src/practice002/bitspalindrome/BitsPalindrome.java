package practice002.bitspalindrome;

public class BitsPalindrome {
    public static boolean isPalindrome(int input) {
        int oldInt = input;
        int temp = input;
        for (int i = 0; i < 32; i++) {
            temp <<= 1;
            temp |= ( input & 1);
            input >>>= 1;
        }
        //System.out.println(oldInt + "  " + temp);
        if (oldInt == temp) {
            return true;
        } else {
            return false;
        }
    }
}
