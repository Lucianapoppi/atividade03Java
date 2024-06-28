package Atividade03;

public class At02 {
    public static void main(String[] args) {

        //2. Verificação de Palíndromo:
        //   Crie um método que verifique se uma lista de caracteres forma um palíndromo.
        //   Um palíndromo é uma sequência que se lê da mesma forma tanto da esquerda
        //   para a direita quanto da direita para a esquerda.

        char[] lista1 = { 'n', 'a', 't', 'a', 'n' };
        char[] lista2 = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println("Lista 1 é palíndromo? " + ehPalindromo(lista1));
        System.out.println("Lista 2 é palíndromo? " + ehPalindromo(lista2));
    }

    public static boolean ehPalindromo(char[] lista) {
        int esquerda = 0;
        int direita = lista.length - 1;

        while (esquerda < direita) {
            if (lista[esquerda] != lista[direita]) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }


}
