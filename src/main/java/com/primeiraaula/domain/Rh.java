package com.primeiraaula.domain;
import java.util.Scanner;

public class Rh {

    public void calcularSalario(String modalidade, double salario) {

        switch(modalidade){
            case "PJ":
                System.out.println("O Salário calculado é: " + pjSalario(salario));
                break;
            case "CLT":
                System.out.println("O Salário calculado é: " + cltSalario(salario));
                break;
            case "Estagio":
                System.out.println("O Salário calculado é: " + estagioSalario(salario));
                break;
            case "0":
                return;

        }
    }

    public double pjSalario(Double salario) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantas horas trabalhadas.");
        int horasTrabalhadas = ler.nextInt();
        double novoSalarioPJ = salario + (20 * horasTrabalhadas);

       return novoSalarioPJ;
        // Método que calcula o salário do PJ
    }

    public double cltSalario(Double salario) {
        double novoSalarioCLT;
        novoSalarioCLT = salario * 1.08;

       return novoSalarioCLT;
    }

    public double estagioSalario(Double salario) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantos dias trabalhados.");
        int diasTrabalhados = ler.nextInt();
        double novoSalarioEstagio = salario + (10 * diasTrabalhados);

       return novoSalarioEstagio;
    }
}

