import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora do primeiro horário:");
        int horas1 = scanner.nextInt();

        System.out.println("Digite os minutos do primeiro horário:");
        int minutos1 = scanner.nextInt();

        System.out.println("Digite os segundos do primeiro horário:");
        int segundos1 = scanner.nextInt();

        System.out.println("Digite a hora do segundo horário:");
        int horas2 = scanner.nextInt();

        System.out.println("Digite os minutos do segundo horário:");
        int minutos2 = scanner.nextInt();

        System.out.println("Digite os segundos do segundo horário:");
        int segundos2 = scanner.nextInt();

        int totalSegundos1 = converterParaSegundos(horas1, minutos1, segundos1);
        int totalSegundos2 = converterParaSegundos(horas2, minutos2, segundos2);

        int diferencaSegundos = Math.abs(totalSegundos1 - totalSegundos2);

        System.out.println("A diferença entre os dois horários é de " + diferencaSegundos + " segundos.");

        scanner.close();
    }

    private static int converterParaSegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}