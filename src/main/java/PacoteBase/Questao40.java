import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();

        int[] idades = new int[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        int somaIdades = 0;
        int maiorIdade = idades[0];
        int menorIdade = idades[0];
        int quantidadeMaiorIdade = 0;

        for (int idade : idades) {
            somaIdades += idade;
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade >= 18) {
                quantidadeMaiorIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maior de idade: " + quantidadeMaiorIdade);
    }
}