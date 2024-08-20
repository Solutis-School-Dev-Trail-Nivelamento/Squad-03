package PacoteBase;

import java.util.Scanner;


public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 50.0;
        int minutosInclusos = 100;
        int minutosVaiVaiInclusos = 50;

        char tipoLigacao;
        int minutos;

        while (true) {
            System.out.print("Digite o tipo de ligação ( 'o'  para outros,  'v'  para Vai-Vai e  'f'  para Telefones fixos) ou digite 'q' para sair: ");
            tipoLigacao = scanner.next().charAt(0);

            if (tipoLigacao == 'q') {
                System.out.println("Programa finalizado!");
                break;
            }

            System.out.print("Digite a quantidade de minutos: ");
            minutos = scanner.nextInt();

            double valorMinuto;
            switch (tipoLigacao) {
                case 'o':
                    valorMinuto = minutos > minutosInclusos ? 0.65 : 0;
                    break;
                case 'v':
                    valorMinuto = minutos > minutosInclusos + minutosVaiVaiInclusos ? 0.20 : 0;
                    break;
                case 'f':
                    valorMinuto = (minutos > minutosInclusos ? minutos - minutosInclusos : 0) * 0.65 / 2;
                    break;
                default:
                    System.out.println("Tipo de ligação inválido.");
                    continue;
            }

            double valorTotal = valorMinuto * minutos;
            saldo -= valorTotal;

            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }

        scanner.close();
    }
}