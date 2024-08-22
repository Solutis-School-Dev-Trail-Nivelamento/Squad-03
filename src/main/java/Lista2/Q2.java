package Lista2;

import java.util.Scanner;

public class Q2 {
   public static void main(String[] args) {
	   Scanner sc= new Scanner (System.in);
	   System.out.println("Informe seu salário:");
	   double salario= sc.nextDouble();
	   System.out.println("Informe o salário mínimo atual:");
	   double salarioMatual= sc.nextDouble();
	   double QtdSM=salario/salarioMatual;
       String resultado = String.format("%.2f", QtdSM);
	   System.out.println("A quantidade de salários mínimos que você recebe é: " + resultado);
	   sc.close();
   }
       
}

       