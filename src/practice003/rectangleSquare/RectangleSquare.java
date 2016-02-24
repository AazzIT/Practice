package practice003.rectangleSquare;

public class RectangleSquare {
    private int maxX = 0;
    private int maxH = 0;
    private int maxW = 0;
    int[][] grid;

    public int measure(int[] x, int[] h, int[] w) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxX) maxX = x[i];
            if (h[i] > maxH) maxH = h[i];
            if (w[i] > maxW) maxW = w[i];
        }
        grid = new int[maxX + maxW][maxH];
        for (int i = 0; i < x.length; i++) {
            drawRectangleInArray(x[i], h[i], w[i]);
        }
        for (int i = 0; i < (maxX + maxW); i++) {
            for (int j = 0; j < maxH; j++) {
                if (grid[i][j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    public void drawRectangleInArray(int x, int h, int w) {
        for (int i = x; i < x + w; i++) {
            for (int j = 0; j < h; j++) {
                grid[i][j] = 1;
            }
        }
    }
}
