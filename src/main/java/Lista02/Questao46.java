
import java.util.Scanner;

public class Questao46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 200 nomes de pessoas: ");
        String[] nomes = new String[200];

        int quantidadeHomensMaioresDeIdade = 0;
        int quantidadeMulheresMaioresDeIdade = 0;

        for (int i = 0; i < 200; i++) {
            System.out.print("\nNome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            if (sexo == 'M' && idade >= 18) {
                quantidadeHomensMaioresDeIdade++;
            } else if (sexo == 'F' && idade >= 18) {
                quantidadeMulheresMaioresDeIdade++;
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + quantidadeHomensMaioresDeIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + quantidadeMulheresMaioresDeIdade);
        scanner.close();
    }
}
