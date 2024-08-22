package Heloisa.Exercicio30;

import Heloisa.Exercicio29.Ponto;

class Retangulo {
    Ponto p1, p2, p3, p4;

    Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    boolean pontosSobrepostos() {
        return (p1.x == p2.x && p1.y == p2.y) ||
                (p1.x == p3.x && p1.y == p3.y) ||
                (p1.x == p4.x && p1.y == p4.y) ||
                (p2.x == p3.x && p2.y == p3.y) ||
                (p2.x == p4.x && p2.y == p4.y) ||
                (p3.x == p4.x && p3.y == p4.y);
    }

    boolean intercepta(Retangulo outro){
        return !(outro.p1.x > p2.x || outro.p2.x < p1.x ||
                outro.p1.y > p3.y || outro.p3.y < p1.y);
    }
}

