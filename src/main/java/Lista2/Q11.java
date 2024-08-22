package Lista2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Informe sua idade: "); 
        int idade = sc.nextInt(); 
        
        if (idade < 16) {
            System.out.println("O cidadão não pode votar.");
        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Para essa idade, o voto é facultativo.");
        } else {
            System.out.println("Para essa idade, o voto é obrigatório.");
        }
        
        sc.close(); 
    }
}

