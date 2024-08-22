package Lista02;

/*39. Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
número) é igual a ele mesmo.*/

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (ehPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }

    public static boolean ehPerfeito(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        if (somaDivisores == numero) {
            return true;
        } else {
            return false;
        }
    }
}
