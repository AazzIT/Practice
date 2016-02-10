package practice002.setzero;

public class SetZero {
    public static int set(int num, int i) {
        int n = ~ (1 << (i - 1));
        return num & n;
    }
}
