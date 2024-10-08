package Heloisa;

/*38. Verifique se um número é primo ou não.*/

public class Exercicio38 {
    public static void main(String[] args) {

        int numero = 16;
        if (isPrime(numero)) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
