import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do dia:");
        int dia = scanner.nextInt();

        System.out.println("Digite o número do mês:");
        int mes = scanner.nextInt();

        String nomeMes = "";
        boolean dataValida = false;
        String trimestre = "";

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "1º Trimestre";
                break;
            case 2:
                nomeMes = "Fevereiro";
                dataValida = (dia >= 1 && dia <= 28);
                trimestre = "1º Trimestre";
                break;
            case 3:
                nomeMes = "Março";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "1º Trimestre";
                break;
            case 4:
                nomeMes = "Abril";
                dataValida = (dia >= 1 && dia <= 30);
                trimestre = "2º Trimestre";
                break;
            case 5:
                nomeMes = "Maio";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "2º Trimestre";
                break;
            case 6:
                nomeMes = "Junho";
                dataValida = (dia >= 1 && dia <= 30);
                trimestre = "2º Trimestre";
                break;
            case 7:
                nomeMes = "Julho";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "3º Trimestre";
                break;
            case 8:
                nomeMes = "Agosto";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "3º Trimestre";
                break;
            case 9:
                nomeMes = "Setembro";
                dataValida = (dia >= 1 && dia <= 30);
                trimestre = "3º Trimestre";
                break;
            case 10:
                nomeMes = "Outubro";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "4º Trimestre";
                break;
            case 11:
                nomeMes = "Novembro";
                dataValida = (dia >= 1 && dia <= 30);
                trimestre = "4º Trimestre";
                break;
            case 12:
                nomeMes = "Dezembro";
                dataValida = (dia >= 1 && dia <= 31);
                trimestre = "4º Trimestre";
                break;
            default:
                nomeMes = "Inválido";
                break;
        }

        if (mes >= 1 && mes <= 12) {
            if (dataValida) {
                System.out.println("A data " + dia + " de " + nomeMes + " está válida.");
                System.out.println("Você nasceu no " + trimestre + ".");
            } else {
                System.out.println("Data inválida para o mês " + nomeMes + ".");
            }
        } else {
            System.out.println("Mês inválido.");
        }

        scanner.close();
    }
}
