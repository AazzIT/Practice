package practice001.matrixsnaketraversal_004;

public class MatrixSnakeTraversal {
    public static int[] print(int[][] input) {
        int[] ret = new int[input.length * input[0].length];
        int nrows = input.length;
        int ncols = input[0].length;  // assuming rows of equal length
        for (int col = 0; col < input[0].length; col++) {
                for (int row = 0; row < input.length; row++) {
                    if ((col % 2) == 0) {
                        ret[col * nrows + row] = input[row][col];
                    } else {
                        ret[col * nrows + row] = input[nrows - row - 1][col];
                    }
                }
        }
        return ret;
    }
}
