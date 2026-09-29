public class Main {

    static int powerOf(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    static int sumOfNaturalNumbersUpTo(int limite) {
        int soma = 0;
        for (int i = 1; i <= limite; i++) {
            soma += i;
        }
        return soma;
    }

    static int sumOfNaturalNumbersBetween(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        return soma;
    }

    static int sumOfEvenNumbersBetween(int inicio, int fim) {
        int soma = 0;
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return soma;
    }

    static int numberOfDivisorsOf(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        return cont;
    }

    static String isPrime(int numero) {
        int divisores = numberOfDivisorsOf(numero);

        if (divisores == 2) {
            return "primo";
        } else {
            return "não é primo";
        }
    }


    public static void main(String[] args) {
        int potencia = powerOf(4, 4);
        System.out.println("Potência (4^4): " + potencia);

        int somaAte = sumOfNaturalNumbersUpTo(19);
        System.out.println("Soma até 19: " + somaAte);

        int somaEntre = sumOfNaturalNumbersBetween(5, 9);
        System.out.println("Soma entre 5 e 9: " + somaEntre);

        int somaPares = sumOfEvenNumbersBetween(1, 10);
        System.out.println("Soma dos pares entre 1 e 10: " + somaPares);

        int divisores = numberOfDivisorsOf(7);
        System.out.println("Número de divisores do 7: " + divisores);

        String resultadoPrimo = isPrime(7);
        System.out.println("Resultado primo para o 7: " + resultadoPrimo);
    }
}