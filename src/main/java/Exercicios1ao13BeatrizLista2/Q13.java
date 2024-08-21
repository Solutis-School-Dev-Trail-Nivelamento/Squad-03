package Exercicios1ao13BeatrizLista2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Insira a primeira nota: "); 
        double nota1 = sc.nextDouble(); 

        System.out.print("Insira a segunda nota: "); 
        double nota2 = sc.nextDouble(); 

        System.out.print("Insira a terceira nota: "); 
        double nota3 = sc.nextDouble(); 

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) {
            System.out.println("Aprovado!");
        } else if(media >= 5 && media < 7) {
            System.out.println("Recuperação.");
            System.out.print("Insira a nota da prova final: ");
            double notaFinal = sc.nextDouble();
            if(notaFinal >= 5) {
                System.out.println("Aprovado na prova final!");
            } else {
                System.out.println("Reprovado na prova final.");
            }
        } else {
            System.out.println("Reprovado.");
        }

        sc.close(); 
    }
}
