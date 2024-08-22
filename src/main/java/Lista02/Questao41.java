import java.util.Random;
import java.util.Scanner;

public class Questao41 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroSorteado = gerador.nextInt(100) + 1;
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu estou pensando em um número entre 1 e 100.");
        System.out.println("Tente adivinhar o número!");

        while (true) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSorteado) {
                System.out.println("\nO número é MAIOR que sua tentativa!");
            } else if (tentativa > numeroSorteado) {
                System.out.println("\nO número é MENOR que sua tentativa!");
            } else {
                System.out.println("\nParabéns! Você acertou!\nO número era " + numeroSorteado + ". Você acertou após " + tentativas + " tentativas!");
                break;
            }
        }
    }
}