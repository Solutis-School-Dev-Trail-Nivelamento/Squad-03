package Lista02;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		   Scanner sc= new Scanner (System.in);
		   System.out.println("Informe a primeira nota:");
		   double nota1= sc.nextDouble();
		   System.out.println("Informe a segunda nota:");
		   double nota2= sc.nextDouble();
		   System.out.println("Informe a terceira nota:");
		   double nota3= sc.nextDouble();
		   System.out.println("Informe a quarta nota:");
		   double nota4= sc.nextDouble();
		   double media= (nota1+nota2+nota3+nota4)/4;
		   System.out.println("A média do aluno é: "+media);

		   sc.close();
	}
}