package practice001.matrixtraversal_008;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3, }, {4, 5, 6, }, {7, 8, 9, }, {10, 11, 12, }};
        int[] result = MatrixTraversal.print(intArray);
        System.out.println(Arrays.toString(result));
    }
}
