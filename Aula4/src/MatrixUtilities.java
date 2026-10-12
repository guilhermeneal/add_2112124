public class MatrixUtilities {
    static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("A matriz é válida!");
            return true;
        }
        ;
        int columns = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != columns) {
                System.out.println("A matriz é inválida!");
                return false;
            }
        }
        System.out.println("A matriz é válida!");
        return true;
    }

    public static boolean isIdentity(int[][] matrix2) {
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (i == j && matrix2[i][j] != 1) {
                    return false;
                }
                if (i != j && matrix2[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int constant) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] * constant;
            }
        }
        return result;
    }

    public static boolean areCompatibleForSum(int[][] first, int[][] second) {
        if (!isMatrix(first) || !isMatrix(second)) {
            return false;
        }
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i].length != second[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] sumOf(int[][] first, int[][] second) {
        int[][] result = new int[first.length][];
        for (int i = 0; i < first.length; i++) {
            result[i] = new int[first[i].length];
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
}
