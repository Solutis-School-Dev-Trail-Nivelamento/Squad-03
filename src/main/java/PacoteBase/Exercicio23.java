import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o dia de nascimento de " + nome1 + ": ");
        int dia1 = scanner.nextInt();

        System.out.print("Digite o mês de nascimento de " + nome1 + ": ");
        int mes1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite o dia de nascimento de " + nome2 + ": ");
        int dia2 = scanner.nextInt();

        System.out.print("Digite o mês de nascimento de " + nome2 + ": ");
        int mes2 = scanner.nextInt();

        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else if (mes1 > mes2 || (mes1 == mes2 && dia2 < dia1)) {
            System.out.println(nome2 + " faz aniversário primeiro.");
        } else {
            System.out.println(nome1 + " e " + nome2 + " fazem aniversário no mesmo dia.");
        }

        scanner.close();
    }
}
