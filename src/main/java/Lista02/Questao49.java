public class Questao49 {
    public static void main(String[] args) {
        int[] fibonacci = new int[50];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < 50; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
