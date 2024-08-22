import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        if (idade1 > idade2) {
            System.out.println(nome1 + " é a pessoa mais velha.");
            System.out.println(nome2 + " é a pessoa mais nova.");
        } else if (idade1 < idade2) {
            System.out.println(nome2 + " é a pessoa mais velha.");
            System.out.println(nome1 + " é a pessoa mais nova.");
        } else {
            System.out.println(nome1 + " e " + nome2 + " têm a mesma idade.");
        }

        scanner.close();
    }
}