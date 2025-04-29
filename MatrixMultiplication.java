
// 82.	Create a program to perform matrix multiplication.

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 0}, {1, 2}};
        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    c[i][j] += a[i][k] * b[k][j];

        for (int[] row : c) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }
}
