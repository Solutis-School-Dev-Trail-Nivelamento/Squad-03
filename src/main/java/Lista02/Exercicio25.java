import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as horas:");
        int horas = scanner.nextInt();

        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();

        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();

        boolean horarioValido = validarHorario(horas, minutos, segundos);

        if (horarioValido) {
            System.out.println("O horário " + formatarHorario(horas, minutos, segundos) + " é válido.");
        } else {
            System.out.println("Horário inválido.");
        }

        scanner.close();
    }

    private static boolean validarHorario(int horas, int minutos, int segundos) {
        return (horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60);
    }

    private static String formatarHorario(int horas, int minutos, int segundos) {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}