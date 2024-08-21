package Exercicios1ao13BeatrizLista2;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Insira a primeira nota: "); 
        double nota1 = sc.nextDouble(); 
        System.out.print("Insira a aegunda nota: "); 
        double nota2 = sc.nextDouble(); 
        System.out.print("Insira a terceira nota: "); 
        double nota3 = sc.nextDouble(); 
        double media= (nota1+nota2+nota3)/3;
        if(media>=7){
            System.out.print("Aprovado!. "); 
        }else if(media>=5 && media<7){
            System.out.print("Recuperação. "); 
        }else{
           System.out.print("Reprovado. ");      	
        }
        sc.close(); 
    }
}
