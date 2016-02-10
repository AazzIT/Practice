package practice002.countbits;

public class CountBits {
    public static int count(int num) {
        int count = 0;
        int mask;
        for (int i = 0; i < 32; i++) {
            mask = 1 << i;
            if ((mask & num) == mask) {
                count++;
            }
        }
        return count;
    }
}
