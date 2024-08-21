import java.util.Scanner;

public class Questao50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        long fibonacci = fibonacci(n);
        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + fibonacci);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}