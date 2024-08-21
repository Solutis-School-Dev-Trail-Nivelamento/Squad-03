import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int cont = 0;

        System.out.println("Digite 500 valores:");
        while (cont < 500) {
            System.out.print("Valor " + (cont + 1) + ": ");
            double valor = scanner.nextDouble();
            soma+= valor;
            cont++;
        }

        double media = soma / 500;

        System.out.println("Media: " + media);

        scanner.close();
    }
}
