package Exercicios1ao13BeatrizLista2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Insira o numerador: ");
            int numerador = sc.nextInt();
            System.out.print("Insira o denominador: ");
            int denominador = sc.nextInt();
            if (denominador == 0) {
                throw new ArithmeticException("ALERTA: O denominador não pode ser zero.");
            }
            double real = (double) numerador / denominador;
            String formatreal = String.format("%.2f", real);
            System.out.println("O número racional " + numerador + "/" + denominador + " é " + formatreal);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } finally {
            sc.close();  
        }
    }
}
