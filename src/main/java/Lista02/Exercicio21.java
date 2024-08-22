import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário (Diretoria, Gerência, Operacional): ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double valorEmprestimo = 0;

        if (cargo.equalsIgnoreCase("Diretoria")) {
            valorEmprestimo = salario * 0.30;
        } else if (cargo.equalsIgnoreCase("Gerência")) {
            valorEmprestimo = salario * 0.25;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            valorEmprestimo = salario * 0.20;
        } else {
            System.out.println("Cargo inválido. Por favor, insira um cargo válido.");
            return;
        }

        System.out.printf("O valor do empréstimo possível para o cargo de %s é: R$ %.2f%n", cargo, valorEmprestimo);

        scanner.close();
    }
}