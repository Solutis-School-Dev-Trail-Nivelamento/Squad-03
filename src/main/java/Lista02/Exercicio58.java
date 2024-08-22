package Lista02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a data (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataStr, formatter);

        System.out.print("Digite a quantidade de dias a somar: ");
        int dias = scanner.nextInt();

        LocalDate novaData = data.plusDays(dias);
        System.out.println(dataStr + " + " + dias + " dias = " + novaData.format(formatter));

        scanner.close();
    }
}
