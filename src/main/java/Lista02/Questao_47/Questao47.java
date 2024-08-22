package Questao_47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao47 {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nNome do paciente (ou 'fim' para finalizar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // Consumir newline

            Paciente paciente = new Paciente(nome, sexo, peso, idade, altura);
            pacientes.add(paciente);
        }

        // Calcula relatório
        int quantidadePacientes = pacientes.size();
        double mediaIdadeHomens = calculaMediaIdadeHomens(pacientes);
        int quantidadeMulheresAlturaPeso = quantidadeMulheresAlturaPeso(pacientes);
        int quantidadePessoas18_25 = quantidadePessoas18_25(pacientes);
        String nomeMaisVelho = nomeMaisVelho(pacientes);
        String nomeMulherMaisBaixa = nomeMulherMaisBaixa(pacientes);
        int menorIdadeRegistrada = menorIdadeRegistrada(pacientes);

        // Exibe relatório
        System.out.println("\nRelatório:");
        System.out.println("i. Quantidade de pacientes: " + quantidadePacientes);
        System.out.println("ii. Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("iii. Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresAlturaPeso);
        System.out.println("iv. Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoas18_25);
        System.out.println("v. Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("vi. Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
        System.out.println("vii. Menor idade registrada: " + menorIdadeRegistrada);
    }

    private static double calculaMediaIdadeHomens(List<Paciente> pacientes) {
        int somaIdades = 0;
        int quantidadeHomens = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'M') {
                somaIdades += paciente.getIdade();
                quantidadeHomens++;
            }
        }
        return (double) somaIdades / quantidadeHomens;
    }

    private static int quantidadeMulheresAlturaPeso(List<Paciente> pacientes) {
        int quantidade = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F' && paciente.getAltura() >= 1.60 && paciente.getAltura() <= 1.70 && paciente.getPeso() > 70) {
                quantidade++;
            }
        }
        return quantidade;
    }

    private static int quantidadePessoas18_25(List<Paciente> pacientes) {
        int quantidade = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() >= 18 && paciente.getIdade() <= 25) {
                quantidade++;
            }
        }
        return quantidade;
    }

    private static String nomeMaisVelho(List<Paciente> pacientes) {
        Paciente maisVelho = null;
        for (Paciente paciente : pacientes) {
            if (maisVelho == null || paciente.getIdade() > maisVelho.getIdade()) {
                maisVelho = paciente;
            }
        }
        return maisVelho.getNome();
    }

    private static String nomeMulherMaisBaixa(List<Paciente> pacientes) {
        Paciente maisBaixa = null;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == 'F' && (maisBaixa == null || paciente.getAltura() < maisBaixa.getAltura())) {
                maisBaixa = paciente;
            }
        }
        return maisBaixa.getNome();
    }

    private static int menorIdadeRegistrada(List<Paciente> pacientes) {
        int menorIdade = Integer.MAX_VALUE;
        for (Paciente paciente : pacientes) {
            if (paciente.getIdade() < menorIdade) {
                menorIdade = paciente.getIdade();
            }
        }
        return menorIdade;
    }
}
