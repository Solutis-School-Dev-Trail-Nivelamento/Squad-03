package PacoteBase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data inicial (DD-MM-AAAA): ");
        String dataInicialStr = scanner.nextLine();

        System.out.print("Digite a data final (DD-MM-AAAA): ");
        String dataFinalStr = scanner.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate dataInicial = LocalDate.parse(dataInicialStr, inputFormatter);
            LocalDate dataFinal = LocalDate.parse(dataFinalStr, inputFormatter);

            if (dataFinal.isBefore(dataInicial)) {
                System.out.println("A data final deve ser posterior à data inicial.");
            } else {
                List<LocalDate> todasAsDatas = new ArrayList<>();
                long diasEntreDatas = ChronoUnit.DAYS.between(dataInicial, dataFinal) + 1;

                for (long i = 0; i < diasEntreDatas; i++) {
                    todasAsDatas.add(dataInicial.plusDays(i));
                }

                System.out.println("Todas as datas:");
                for (LocalDate data : todasAsDatas) {
                    System.out.println(data.format(outputFormatter));
                }
            }
        } catch (Exception e) {
            System.out.println("Formato de data inválido. Use DD-MM-AAAA.");
        }
    }
}