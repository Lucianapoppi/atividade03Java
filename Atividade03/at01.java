package Atividade03;

public class at01 {
    public static void main(String[] args) {

//1. Soma dos Elementos Pares:
//   Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.

        int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int somaPares = calcularSomaElementosPares(lista);

        System.out.println("A soma dos elementos pares da lista é: " + somaPares);
    }

    public static int calcularSomaElementosPares(int[] lista) {
        int soma = 0;


        for (int numero : lista) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        return soma;

    }
}
