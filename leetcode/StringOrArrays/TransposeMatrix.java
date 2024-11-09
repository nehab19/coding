package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;

public class TransposeMatrix {
    static int[][] transposeMatrix(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] newMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][i] = A[i][j];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 0}
        };
        //converting 2-D array to strings
        System.out.println(Arrays.deepToString(transposeMatrix(A)));
    }
}
