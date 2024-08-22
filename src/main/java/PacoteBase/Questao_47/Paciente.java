package Questao_47;

class Paciente {
    private String nome;
    private char sexo;
    private double peso;
    private int idade;
    private double altura;

    public Paciente(String nome, char sexo, double peso, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
