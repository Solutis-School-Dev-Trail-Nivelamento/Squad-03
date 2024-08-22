package Lista02;

/*37.Calcule o fatorial de um número.*/

public class Exercicio37 {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("!" + numero + " = " + fatorial);
    }
}
