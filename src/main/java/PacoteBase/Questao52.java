import java.math.BigInteger;

public class Questao52 {
    public static void main(String[] args) {
        BigInteger totalGrãos = BigInteger.ZERO;
        int graosPorSaco = 1000000; // 1.000.000 graos por saco

        for (int i = 0; i < 64; i++) {
            BigInteger grãos = BigInteger.valueOf(2).pow(i);
            totalGrãos = totalGrãos.add(grãos);
            System.out.println("Casa " + (i + 1) + ": " + grãos + " grãos de arroz");
        }

        System.out.println("Total de grãos de arroz: " + totalGrãos);

        BigInteger totalDeSacos = totalGrãos.divide(BigInteger.valueOf(graosPorSaco));
        System.out.println("Total de sacos de arroz: " + totalDeSacos);
    }
}