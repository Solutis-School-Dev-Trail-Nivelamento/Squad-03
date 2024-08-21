package Exercicios1ao13BeatrizLista2;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		   Scanner sc= new Scanner (System.in);
		   System.out.println("Informe o número de mulheres:");
		   int mulheres= sc.nextInt();
		   System.out.println("Informe o número de homens:");
		   int homens= sc.nextInt();
		   int total= homens+mulheres;
		   double percentualH=((double) homens/total*100);
		   double percentualM=((double) mulheres/total*100);
		   String percentualHo = String.format("%.2f",percentualH);
		   String percentualMu = String.format("%.2f",percentualM);
		   System.out.println("Percentual de homens: "+percentualHo+"%");
		   System.out.println("Percentual de mulheres: "+percentualMu+"%");

		   sc.close();
	}
}