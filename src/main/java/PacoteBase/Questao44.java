import java.util.Scanner;

public class Questao44{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        System.out.println("Digite os " + quantidade + " valores:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidade;

        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}