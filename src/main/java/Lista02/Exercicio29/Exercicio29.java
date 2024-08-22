package Heloisa.Exercicio29;

/*Receba do usuário dois pontos do plano cartesiano. Estes pontos devem representar os
vértices superior esquerdo e inferior direito de um retângulo paralelo aos eixos x e y.
Primeiramente informe se estes pontos podem constituir um retângulo, ou seja:
- se é um retângulo
- se é uma reta horizontal
- se é uma reta vertical
- se é um ponto
Depois, calcule e exiba área deste retângulo.
Em seguida, receba outro ponto e exiba a posição dele em relação ao retângulo.
Uma das 10 seguintes situações é possível:
- acima e à esquerda
- acima
- acima e à direita
- embaixo e à esquerda
- embaixo
- embaixo e à direita
- à esquerda
- à direita
- dentro do retângulo
- na linha do retângulo
*/

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as coordenadas do vértice superior esquerdo (x1 y1):");
        Ponto p1 = new Ponto(sc.nextDouble(), sc.nextDouble());

        System.out.println("Insira as coordenadas do vértice inferior direito (x2 y2):");
        Ponto p2 = new Ponto(sc.nextDouble(), sc.nextDouble());

        Retangulo retangulo = new Retangulo(p1, p2);

        String tipo = retangulo.tipoDeForma();
        System.out.println(tipo);

        if (tipo.equals("É um retângulo.")) {
            double area = retangulo.calcularArea();
            System.out.println("A área do retângulo é: " + area);
        }

        System.out.println("Insira as coordenadas de um ponto (x y):");
        Ponto p = new Ponto(sc.nextDouble(), sc.nextDouble());

        String posicao = retangulo.verificarPosicao(p);
        System.out.println("A posição do ponto em relação ao retângulo é: " + posicao);

        sc.close();
    }
}
