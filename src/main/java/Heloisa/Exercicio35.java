package Lista02;

/*35.Exiba uma quantidade de números sorteados determinada pelo usuário.
Peça também que o usuário determine a faixa do sorteio.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int inicio;
        int fim;

        System.out.println("Digite uma quantidade de números a ser sorteada: ");
        while (true) {
            if (sc.hasNextInt()) {
                quantidade = sc.nextInt();
                if (quantidade > 0) {
                    break;
                } else {
                    System.out.println("A quantidade de números deve ser maior que 0. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                sc.next();
            }
        }

        System.out.println("Digite a faixa de números a ser sorteada (Ex: 10 60): ");
        while (true) {
            if (sc.hasNextInt()) {
                inicio = sc.nextInt();
                fim = sc.nextInt();
                if (fim >= inicio) {
                    break;
                } else {
                    System.out.println("O último número deve ser maior ou igual ao primeiro. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira números inteiros.");
                sc.next();
            }
        }

        if (quantidade > (fim - inicio + 1)) {
            System.out.println("Não é possível sortear essa quantidade de números sem repetição na faixa fornecida.");
            return;
        }

        Set<Integer> numerosSorteados = new HashSet<>();

        while (numerosSorteados.size() < quantidade) {
            int numeroSorteado = inicio + (int)(Math.random() * (fim - inicio + 1));
            numerosSorteados.add(numeroSorteado);
        }

        System.out.println("Números sorteados: ");
        for (int numero : numerosSorteados) {
            System.out.println(numero);
        }

        sc.close();
    }
}

