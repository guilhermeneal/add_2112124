public class Main {
    public static void main(String[] array) {

        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};

        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11},
                {11, 13, 15},
                {10, 19, 16}
        };
        for (int i = 0; i < studentNumbers.length; i++) {
            System.out.println("O Aluno: " + studentNumbers[i]);
            double sum = 0;

            for (int j = 0; j < courseAcronyms.length; j++) {
                System.out.println(
                        "teve as seguintes classificações "
                                + courseAcronyms[j]
                                + ": "
                                + studentGrades[i][j]
                );
                sum += studentGrades[i][j];
            }
            double media = sum / courseAcronyms.length;
            System.out.println("A média do aluno e " + media);
        }
    }
}

