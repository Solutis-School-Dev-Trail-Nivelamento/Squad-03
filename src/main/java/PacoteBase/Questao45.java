
import java.util.Scanner;

public class Questao45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 100 números: ");
        int[] num = new int[100];

        for (int i = 0; i < 100; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        int maior = num[0];

        for (int i = 1; i < 100; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
        }
        
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
