public class Main {
    public static void a6() {
        System.out.println("Hello World");

    }

    static double a7(double largura, double altura) {
        return 2 * (largura + altura);
    }

    static double a8(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;

    }

    static double a9(double Farenheit) {
        return (Farenheit - 32) * (5 / 9);
    }

    static double maximo(double[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        double max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    static double minimo(double[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        double min = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    static double media(double[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        double soma = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            soma += numeros[i];
        }
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        a6();

        double perimetro = a7(5, 2);
        System.out.println("o perimetro e " + perimetro);

        double volume = a8(3, 2, 7);
        System.out.println("o volume e " + volume);

        double celcios = a9(300);
        System.out.println("Estao " + celcios);

        double[] conjunto = new double[]{1, 2, 4, 5, 6, 7, 8};

        double max = maximo(conjunto);
        System.out.println("O maximo e " + max);

        double min = minimo(conjunto);
        System.out.println("O minimo e " + min);

        double media = media(conjunto);
        System.out.println("A media e " + media);

    }
}
