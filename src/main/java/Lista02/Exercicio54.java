package Lista02;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial em reais: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite o valor final em reais: ");
        double valorFinal = scanner.nextDouble();

        System.out.print("Digite o valor do incremento: ");
        double incremento = scanner.nextDouble();

        System.out.print("Digite o valor de 1 dólar em reais: ");
        double valorDolar = scanner.nextDouble();

        System.out.println("\nTabela de Conversão\n");
        System.out.printf("%-15s | %-15s\n", "Reais", "Dólares");
        System.out.println("------------------------");

        for (double valorReal = valorInicial; valorReal <= valorFinal; valorReal += incremento) {
            double valorDolarConvertido = valorReal / valorDolar;
            System.out.printf("BRL %-15.2f | USD %-15.2f\n", valorReal, valorDolarConvertido);
        }
    }
}