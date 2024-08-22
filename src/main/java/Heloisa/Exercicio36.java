package Lista02;

/*36.Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
Dica: use o operador % para calcular o resto da divisão entre dois números.
*/

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Digite dois números inteiros (o primeiro deve ser menor que o segundo): ");

        while (true) {

            if (sc.hasNextInt()) {
                a = sc.nextInt();

                if (sc.hasNextInt()) {
                    b = sc.nextInt();

                    if (a < b) {
                        break;
                    } else {
                        System.out.println("O primeiro número deve ser menor que o segundo. Tente novamente.");
                    }
                } else {
                    System.out.println("Entrada inválida para o segundo número. Por favor, insira dois números inteiros.");
                    sc.next();
                }
            } else {
                System.out.println("Entrada inválida para o primeiro número. Por favor, insira dois números inteiros.");
                sc.next();
            }
        }

        numerosImpares(a, b);

        sc.close();
    }

    public static void numerosImpares(int a, int b) {
        System.out.println("Números ímpares: ");

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}