import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Ordem crescente: " + num2 + ", " + num1);
        }

        scanner.close();
    }
}