package PacoteBase;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos que você quer que apareça: ");
        int numTriangulos = scanner.nextInt();

        String triangulo = "*\n**\n***";

        for (int i = 1; i <= numTriangulos; i++) {
            System.out.println(triangulo);
            System.out.println();
        }

        scanner.close();
    }
}
