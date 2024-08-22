package Lista02;

import java.util.Scanner;
public class Q1 {
   public static void main(String[] args) {
	   Scanner sc= new Scanner (System.in);
	   System.out.println("Informe seu ano de nascimento:");
	   int ano= sc.nextInt();
	   System.out.println("Informe o ano atual:");
	   int anoAtual= sc.nextInt();
	   int idade=anoAtual-ano;
	   System.out.println("Você tem " + idade +" anos de idade.");
	   sc.close();
   }
       
}

