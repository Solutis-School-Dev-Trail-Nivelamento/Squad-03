import java.util.Random;

public class Questao42 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int[] grupo = new int[3];

            for (int j = 0; j < 3; j++) {
                grupo[j] = random.nextInt(60);
    }

            for (int j = 0; j < 3; j++) {
                for (int k = j; k < 3; k++) {
                    if (grupo[j] > grupo[k]) {
                        int aux = grupo[j];
                        grupo[j] = grupo[k];
                        grupo[k] = aux;
                    }
                }
            }

            System.out.println("Grupo " + (i + 1) + ": " + grupo[0] + ", " + grupo[1] + ", " + grupo[2]);

        }
    }
}