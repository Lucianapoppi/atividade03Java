package Atividade03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class At04 {
    public static void main(String[] args) {

        //4. Remoção de Elementos Duplicados:
        //   Escreva um método que remova todos os elementos duplicados de uma lista,
        //   mantendo apenas a primeira ocorrência de cada elemento.

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(2);

        System.out.println("Lista original:");
        System.out.println(lista);

        removerDuplicados(lista);

        System.out.println("\nLista sem elementos duplicados:");
        System.out.println(lista);
    }

    public static void removerDuplicados(List<Integer> lista) {
        Set<Integer> conjunto = new HashSet<>();
        List<Integer> resultado = new ArrayList<>();

        for (Integer elemento : lista) {
            if (!conjunto.contains(elemento)) {
                conjunto.add(elemento);
                resultado.add(elemento);
            }
        }

        lista.clear();
        lista.addAll(resultado);


    }
}
