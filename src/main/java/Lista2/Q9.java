package Lista2;

import java.util.Scanner;

public class Q9
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade= sc.nextInt();
		if(idade>=18){
		    System.out.println("O usuário é maior de idade.");
		}else{
		    System.out.println("O usuário não é maior de idade.");
		    
		}
		sc.close();

	}
}
