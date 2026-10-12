public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        MatrixUtilities.show(matrix);
        MatrixUtilities.isMatrix(matrix);
        MatrixUtilities.isIdentity(matrix2);
        if (MatrixUtilities.isIdentity(matrix2)) {
            System.out.println("A matriz é uma matriz identidade!");
        } else {
            System.out.println("A matriz NÃO é uma matriz identidade.");
        }
        MatrixUtilities.show(MatrixUtilities.multiplyBy(matrix, 2));
        MatrixUtilities.areCompatibleForSum(matrix,matrix2);
        MatrixUtilities.show(MatrixUtilities.sumOf(matrix, matrix2));
    }
}
