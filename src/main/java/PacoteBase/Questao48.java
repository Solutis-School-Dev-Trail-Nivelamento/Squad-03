import java.util.Scanner;

public class Questao48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas para cálculo da média semestral: ");
        int quantidadeNotas = scanner.nextInt();

        double[] notas = new double[quantidadeNotas];
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.print("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double media = calcularMedia(notas);
        String resultado = avaliarAluno(media, faltas);

        System.err.println("Media: " + media);
        System.err.println("Faltas: " + faltas);

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    public static double calcularMedia(double[]notas) {
        double soma = 0;
        for (double nota : notas) {
            soma+= nota;
        }
        return soma / notas.length;
    }

    public static String avaliarAluno(double media, int faltas) {
        if(media >= 7 && faltas <= 10) {
            return "Aprovado";
        } else if (media < 4 || faltas > 10) {
            return "Reprovado por nota" + (faltas > 10 ? " e faltas" : "");
        } else {
            return "Reprovado por nota";
        }
        }
}
