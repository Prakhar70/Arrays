package FAQs_Medium;

public class RotateMatrix {
    public void rotateMatrix(int[][] matrix) {
        transposeMatrix(matrix);
        MirrorMatrix(matrix);
    }

    private void MirrorMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    private void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
