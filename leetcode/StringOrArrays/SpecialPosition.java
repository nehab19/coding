package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class SpecialPosition {
    static int numSpecial(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowArray = new int[m];
        int[] columnArray = new int[n];

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 1) {
                    rowArray[row]++;
                    columnArray[col]++;
                }
            }
        }

        int result = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 1 && rowArray[row] == 1 && columnArray[col] == 1) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] A = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 1, 1}
        };
        System.out.println(numSpecial(A));

    }
}

