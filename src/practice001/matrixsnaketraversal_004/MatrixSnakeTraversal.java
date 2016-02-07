package practice001.matrixsnaketraversal_004;

public class MatrixSnakeTraversal {
    public static int[] print(int[][] input) {
        int[] ret = new int[input.length * input[0].length];
        System.out.println(ret.length);
        System.out.println(input.length);
        System.out.println(input[0].length);
        int k = 0;
        for (int i = 0; i < input.length; i++) {

                for (int j = 0; j < input.length; j++) {
                    if ((i % 2) == 0) {
                        ret[k + j] = input[j][i];
                    } else {
                        ret[k + j] = input[input[i].length - (j + 1)][i];
                    }
                    System.out.println(ret[k + j]);
                }
            k += input[i].length;
        }
        return ret;
    }
}
