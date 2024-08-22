import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do mês:");
        String mes = scanner.nextLine();

        int numeroMes = -1;

        if (mes.equalsIgnoreCase("janeiro")) {
            numeroMes = 1;
        } else if (mes.equalsIgnoreCase("fevereiro")) {
            numeroMes = 2;
        } else if (mes.equalsIgnoreCase("março")) {
            numeroMes = 3;
        } else if (mes.equalsIgnoreCase("abril")) {
            numeroMes = 4;
        } else if (mes.equalsIgnoreCase("maio")) {
            numeroMes = 5;
        } else if (mes.equalsIgnoreCase("junho")) {
            numeroMes = 6;
        } else if (mes.equalsIgnoreCase("julho")) {
            numeroMes = 7;
        } else if (mes.equalsIgnoreCase("agosto")) {
            numeroMes = 8;
        } else if (mes.equalsIgnoreCase("setembro")) {
            numeroMes = 9;
        } else if (mes.equalsIgnoreCase("outubro")) {
            numeroMes = 10;
        } else if (mes.equalsIgnoreCase("novembro")) {
            numeroMes = 11;
        } else if (mes.equalsIgnoreCase("dezembro")) {
            numeroMes = 12;
        }

        if (numeroMes != -1) {
            System.out.println("O número equivalente ao mês " + mes + " é: " + numeroMes);
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}