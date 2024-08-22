package Heloisa;

/*27. Descubra e apresente o maior entre três números fornecidos pelo usuário. Caso eles sejam
iguais, avise ao usuário.*/

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();

        maiorNumero(a, b, c);
    }
    public static void maiorNumero(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Todos os números são iguais.");
            return;
        }

        int x = a;

        if (x < b) {
            x = b;
        }
        if (x < c) {
            x = c;
        }

        System.out.println("Maior número: " + x);

        if (a == b || a == c || b == c) {
            System.out.println("Alguns dos números são iguais.");
        }
    }
}

