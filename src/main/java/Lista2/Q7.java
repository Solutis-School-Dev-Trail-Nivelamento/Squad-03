package Lista2;

import java.util.Scanner;

public class Q7
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Informe a despesa do cliente: ");
		double despesa= sc.nextDouble();
		double comissao= 0.1*despesa;
		System.out.println("A comissão do garçom é de "+comissao);
		sc.close();

	}
}
