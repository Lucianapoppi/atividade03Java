package Atividade03;

public class At03 {
    public static void main(String[] args) {
        // 3. Ordenação de Lista de Números:
        //   Implemente um algoritmo de ordenação (por exemplo, Bubble Sort) para
        //   ordenar uma lista de números inteiros em ordem crescente.

        int[] numeros = { 35, 25, 10, 8, 42 };

        System.out.println("Array original:");
        imprimirArray(numeros);

        bubbleSort(numeros);

        System.out.println("\nArray ordenado:");
        imprimirArray(numeros);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }
        }
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }
}
