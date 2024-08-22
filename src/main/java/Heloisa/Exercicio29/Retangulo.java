package Lista02.Exercicio29;

class Retangulo {
    Ponto superiorEsquerdo, inferiorDireito;

    Retangulo(Ponto superiorEsquerdo, Ponto inferiorDireito) {
        this.superiorEsquerdo = superiorEsquerdo;
        this.inferiorDireito = inferiorDireito;
    }

    String tipoDeForma() {
        if (superiorEsquerdo.x == inferiorDireito.x && superiorEsquerdo.y == inferiorDireito.y) {
            return "É um ponto.";
        } else if (superiorEsquerdo.x == inferiorDireito.x) {
            return "É uma reta vertical.";
        } else if (superiorEsquerdo.y == inferiorDireito.y) {
            return "É uma reta horizontal.";
        } else {
            return "É um retângulo.";
        }
    }

    double calcularArea() {
        return Math.abs((inferiorDireito.x - superiorEsquerdo.x) * (superiorEsquerdo.y - inferiorDireito.y));
    }

    String verificarPosicao(Ponto p) {
        if (p.x < superiorEsquerdo.x && p.y > superiorEsquerdo.y) {
            return "Acima e à esquerda.";
        } else if (p.x >= superiorEsquerdo.x && p.x <= inferiorDireito.x && p.y > superiorEsquerdo.y) {
            return "Acima.";
        } else if (p.x > inferiorDireito.x && p.y > superiorEsquerdo.y) {
            return "Acima e à direita.";
        } else if (p.x < superiorEsquerdo.x && p.y < inferiorDireito.y) {
            return "Embaixo e à esquerda.";
        } else if (p.x >= superiorEsquerdo.x && p.x <= inferiorDireito.x && p.y < inferiorDireito.y) {
            return "Embaixo.";
        } else if (p.x > inferiorDireito.x && p.y < inferiorDireito.y) {
            return "Embaixo e à direita.";
        } else if (p.x < superiorEsquerdo.x && p.y <= superiorEsquerdo.y && p.y >= inferiorDireito.y) {
            return "À esquerda.";
        } else if (p.x > inferiorDireito.x && p.y <= superiorEsquerdo.y && p.y >= inferiorDireito.y) {
            return "À direita.";
        } else if (p.x >= superiorEsquerdo.x && p.x <= inferiorDireito.x && p.y >= inferiorDireito.y && p.y <= superiorEsquerdo.y) {
            return "Dentro do retângulo.";
        } else {
            return "Na linha do retângulo.";
        }
    }
}