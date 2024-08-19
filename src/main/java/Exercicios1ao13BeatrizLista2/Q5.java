package Exercicios1ao13BeatrizLista2;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		   Scanner sc= new Scanner (System.in);
		   System.out.println("Informe o valor do débito:");
		   double debito= sc.nextDouble();
		   System.out.println("Informe a quantidade de meses para pagar:");
		   double t= sc.nextDouble();
		   System.out.println("Informe a taxa:");
		   double i= sc.nextDouble();
		   double juros= debito*i*t/100;
		   double valorF= debito +juros;
		   System.out.println("Valor final da dívída: "+valorF);

		   sc.close();
	}
}