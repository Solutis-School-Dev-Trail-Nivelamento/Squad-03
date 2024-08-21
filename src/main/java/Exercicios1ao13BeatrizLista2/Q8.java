package Exercicios1ao13BeatrizLista2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Insira o numerador: "); 
        int numerador = sc.nextInt(); 
        System.out.print("Insira o denominador: "); 
        int denominador = sc.nextInt(); 
        if (denominador ==0) {
            System.out.println("ALERTA: Insira um número diferente de 0 no denominador.");
        } else {
            double real= (double)numerador/denominador;
            String formatreal=String.format("%.2f",real);
            System.out.println("O número racional "+numerador + "/" + denominador+" é "+formatreal);
        } 
        sc.close(); 
    }
}
