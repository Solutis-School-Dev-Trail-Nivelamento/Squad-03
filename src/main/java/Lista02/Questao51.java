import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int[] tribonacci = new int[n];

        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;

        for (int i = 3; i < n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%4d ", tribonacci[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

}
