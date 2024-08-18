package Lista02;

/*34.Exiba 50 números sorteados de 1 a 100 para o usuário*/

public class Exercicio34 {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            int numeroSorteado = (int) (1 + (Math.random() * 100));
            System.out.println(numeroSorteado);
        }
    }
}
