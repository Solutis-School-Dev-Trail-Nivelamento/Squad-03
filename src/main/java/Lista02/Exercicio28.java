package Lista02;

/*28. Coloque em ordem crescente três números quaisquer.
Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão.*/

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ordemCrescente(a, b, c);
    }

    public static void ordemCrescente(int a, int b, int c) {
        if (a > b) {
            int x = a;
            a = b;
            b = x;
        }
        if (a > c) {
            int x = a;
            a = c;
            c = x;
        }
        if (b > c) {
            int x = b;
            b = c;
            c = x;
        }
        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}
