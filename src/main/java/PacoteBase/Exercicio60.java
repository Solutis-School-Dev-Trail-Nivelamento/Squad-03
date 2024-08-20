package PacoteBase;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor inicial da dívida: R$ ");
        double valorInicial = scanner.nextDouble();
        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxaCorrecao = scanner.nextDouble() / 100;
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();


        double valorAtual = valorInicial;
        System.out.println("Anos\tJan\tFev\tMar\tAbr\tMai\tJun\tJul\tAgo\tSet\tOut\tNov\tDez");
        for (int ano = 2007; ano <= 2007 + anos - 1; ano++) {
            System.out.print(ano + "\t");
            for (int mes = 1; mes <= 12; mes++) {
                System.out.printf("%.2f\t", valorAtual);
                valorAtual *= (1 + taxaCorrecao);
            }
            System.out.println();
        }
    }
}