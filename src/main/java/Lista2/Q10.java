package Lista2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Insira o valor do salário bruto: "); 
        double salarioBruto = sc.nextDouble(); 
        System.out.print("Insira o valor de desconto: "); 
        double desconto = sc.nextDouble(); 
        System.out.print("Insira o valor do empréstimo: "); 
        double emprestimo = sc.nextDouble(); 
        double porcentEmprestimo= (salarioBruto-desconto)*0.3;
        if(emprestimo<=porcentEmprestimo){
            System.out.print("Você poderá fazer o empréstimo. "); 
        }else{
            System.out.print("Você não poderá fazer o empréstimo. "); 
        }
        sc.close(); 
    }
} 
