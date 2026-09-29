import java.util.Arrays;

public class Main {

    static String toString(int[] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                resultado.append(",");
            }
            resultado.append(array[i]);
        }
        return resultado.toString();
    }

    static int maximumOf(int[] array) {
        verificarArrayNaoVazio(array);
        int maximo = array[0];
        for (int valor : array) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }

    static int minimumOf(int[] array) {
        verificarArrayNaoVazio(array);
        int minimo = array[0];
        for (int valor : array) {
            if (valor < minimo) {
                minimo = valor;
            }
        }
        return minimo;
    }

    static int[] copyOf(int[] array) {
        return array == null ? null : Arrays.copyOf(array, array.length);
    }

    static boolean contains(int[] array, int valor) {
        return indexOf(array, valor) != -1;
    }

    static boolean containsDuplicates(int[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static int indexOf(int[] array, int valor) {
        if (array == null) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    static int[] add(int[] array, int valor) {
        int tamanho = array == null ? 0 : array.length;
        int[] resultado = Arrays.copyOf(array == null ? new int[0] : array, tamanho + 1);
        resultado[tamanho] = valor;
        return resultado;
    }

    static int[] remove(int[] array, int valor) {
        if (array == null) {
            return null;
        }
        int indice = indexOf(array, valor);
        if (indice == -1) {
            return copyOf(array);
        }

        int[] resultado = new int[array.length - 1];
        System.arraycopy(array, 0, resultado, 0, indice);
        System.arraycopy(array, indice + 1, resultado, indice, array.length - indice - 1);
        return resultado;
    }

    private static void verificarArrayNaoVazio(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array nÃ£o pode ser nulo nem vazio.");
        }
    }

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
            return "nÃ£o Ã© primo";
        }
    }


    public static void main(String[] args) {
        int potencia = powerOf(4, 4);
        System.out.println("PotÃªncia (4^4): " + potencia);

        int somaAte = sumOfNaturalNumbersUpTo(19);
        System.out.println("Soma atÃ© 19: " + somaAte);

        int somaEntre = sumOfNaturalNumbersBetween(5, 9);
        System.out.println("Soma entre 5 e 9: " + somaEntre);

        int somaPares = sumOfEvenNumbersBetween(1, 10);
        System.out.println("Soma dos pares entre 1 e 10: " + somaPares);

        int divisores = numberOfDivisorsOf(7);
        System.out.println("NÃºmero de divisores do 7: " + divisores);

        String resultadoPrimo = isPrime(7);
        System.out.println("Resultado primo para o 7: " + resultadoPrimo);

        int[] numeros = {4, 8, 2, 8, 5};
        System.out.println("Array: " + toString(numeros));
        System.out.println("MÃ¡ximo: " + maximumOf(numeros));
        System.out.println("MÃ­nimo: " + minimumOf(numeros));
        System.out.println("ContÃ©m 2: " + contains(numeros, 2));
        System.out.println("Tem valores repetidos: " + containsDuplicates(numeros));
        System.out.println("Ãndice do 8: " + indexOf(numeros, 8));

        int[] copia = copyOf(numeros);
        int[] comNovoValor = add(numeros, 10);
        int[] semUmOito = remove(numeros, 8);
        System.out.println("CÃ³pia: " + toString(copia));
        System.out.println("Com 10 no fim: " + toString(comNovoValor));
        System.out.println("Depois de remover um 8: " + toString(semUmOito));
    }
}

