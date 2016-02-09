package practice001.matrixsnaketraversal_004;

public class MatrixSnakeTraversal {
    public static int[] print(int[][] input) {
        int rowsCount = input.length;
        int colsCount = input[0].length;
        int[] resultArray = new int[rowsCount * colsCount];
        for (int col = 0; col < colsCount; col++) {
                for (int row = 0; row < rowsCount; row++) {
                    if ((col % 2) == 0) {
                        resultArray[col * rowsCount + row] = input[row][col];
                    } else {
                        resultArray[col * rowsCount + row] = input[rowsCount - row - 1][col];
                    }
                }
        }
        return resultArray;
    }
}
