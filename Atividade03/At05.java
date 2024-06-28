package Atividade03;

import java.util.HashSet;
import java.util.Set;

public class At05 {
    public static void main(String[] args) {

        //5. Média de Valores Únicos:
        //Implemente um programa que calcule a média aritmética dos valores únicos em uma lista
        // de números inteiros, ou seja, excluindo os valores duplicados da média.

        int[] lista = { 1, 3, 2, 1, 4, 4, 2 };

        double media = calcularMediaValoresUnicos(lista);

        System.out.println("A média dos valores únicos na lista é: " + media);
    }

    public static double calcularMediaValoresUnicos(int[] lista) {
        Set<Integer> conjunto = new HashSet<>();
        int soma = 0;

        // Adiciona os valores únicos ao conjunto e calcula a soma
        for (int numero : lista) {
            if (conjunto.add(numero)) {
                soma += numero;
            }
        }

        // Calcula a média dos valores únicos
        double media = (double) soma / conjunto.size();
        return media;


    }
}
