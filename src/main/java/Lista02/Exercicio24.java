import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if (isDataValida(dia, mes, ano)) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        scanner.close();
    }

    public static boolean isDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasNoMes;
        switch (mes) {
            case 2:
                if (isAnoBissexto(ano)) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
                break;
        }

        return dia >= 1 && dia <= diasNoMes;
    }

    public static boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}