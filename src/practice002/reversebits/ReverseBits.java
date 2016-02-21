package practice002.reversebits;

public class ReverseBits {
    public static int reverse(int input) {
        int temp = input;
        for (int i = 0; i < 32; i++) {
            temp <<= 1;
            temp |= ( input & 1);
            input >>>= 1;
        }
        return temp;
    }
}
