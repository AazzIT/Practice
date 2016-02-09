package practice001.matrixtraversal_008;

public class MatrixTraversal {
    public static int[] print(int[][] input) {
        int top = 0;
        int bottom = input.length - 1;
        int left = 0;
        int right = input[0].length - 1;
        int[] resultArray = new int[input.length * input[0].length];
        int i = 0;
        while (true) {
            // Going Right
            if (left == right + 1) break;
            for (int col = left; col <= right; col++) {
                resultArray[i++] = input[top][col];
            }
            top++;
            // Going Down
            if (top == bottom + 1) break;
            for (int row = top; row <= bottom; row++) {
                resultArray[i++] = input[row][right];
            }
            right--;
            // Going Left
            if (left == right + 1) break;
            for (int col = right; col >= left; col--) {
                resultArray[i++] = input[bottom][col];
            }
            bottom--;
            // Going Up
            if (top == bottom + 1) break;
            for (int row = bottom; row >= top; row--) {
                resultArray[i++] = input[row][left];
            }
            left++;
        }
        return resultArray;
    }
}
