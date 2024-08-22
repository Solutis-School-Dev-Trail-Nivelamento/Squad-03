package Lista02;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro candidato: ");
        String candidato1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo candidato: ");
        String candidato2 = scanner.nextLine();

        System.out.print("Digite o nome do terceiro candidato: ");
        String candidato3 = scanner.nextLine();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o número do candidato (1, 2, 3) ou 0 para branco: ");
            int voto = scanner.nextInt();

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else if (voto == 0) {
                votosBranco++;
            }

            totalVotos++;

            System.out.print("Deseja continuar votando? (s/n): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 's') {
                break;
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println(candidato1 + ": " + votosCandidato1 + " votos (" + (votosCandidato1 * 100.0 / totalVotos) + "%)");
        System.out.println(candidato2 + ": " + votosCandidato2 + " votos (" + (votosCandidato2 * 100.0 / totalVotos) + "%)");
        System.out.println(candidato3 + ": " + votosCandidato3 + " votos (" + (votosCandidato3 * 100.0 / totalVotos) + "%)");
        System.out.println("Votos em branco: " + votosBranco + " votos (" + (votosBranco * 100.0 / totalVotos) + "%)");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Vencedor: " + candidato1);
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("Vencedor: " + candidato2);
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("Vencedor: " + candidato3);
        } else {
            System.out.println("Houve um empate.");
        }

        scanner.close();
    }
}
