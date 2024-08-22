package Heloisa.Exercicio30;

/*30. Receba dois retângulos através dos seus quatro vértices. Cada vértice é um ponto e é
formado por duas coordenadas x e y. Faça a crítica destes pontos, pois eles não podem se
sobrepor. Observe que o usuário pode fornecê-los em qualquer ordem. Em seguida informe
se os dois retângulos se interceptam em algum lugar.*/

import Heloisa.Exercicio29.Ponto;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as coordenadas dos 4 vértices do primeiro retângulo:");
        Retangulo r1 = new Retangulo(
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble())
        );

        System.out.println("Insira as coordenadas dos 4 vértices do segundo retângulo:");
        Retangulo r2 = new Retangulo(
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble()),
                new Ponto(sc.nextDouble(), sc.nextDouble())
        );

        if (r1.pontosSobrepostos() || r2.pontosSobrepostos()) {
            System.out.println("Alguns dos pontos estão sobrepostos.");
            return;
        }

        if (r1.intercepta(r2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }
}
