package com.primeiraaula.domain;
import java.util.Scanner;

public class Rh {
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    private String modalidade;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;

    public void teste() {
        System.out.println("Teste");
    }

    public void calcularSalario(String modalidade, double salario) {

        System.out.println(modalidade + " : " + salario);

    }

    public static void pjSalario() {
        double salario = 800;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantas horas trabalhadas.");
        int horasTrabalhadas = ler.nextInt();
        double novoSalarioPJ = salario + 10 * horasTrabalhadas;

        System.out.println("Seu salário é: " + novoSalarioPJ);
        // Método que calcula o salário do PJ
    }

    public static void cltSalario(String[] args) {
        double salario = 1000;
        double novoSalarioCLT;
        novoSalarioCLT = salario * 1.08;

        System.out.println("Seu salário é: " + novoSalarioCLT);
        // Método que calcula o salário do CLT
    }

    public static void estagioSalario() {
        double salario = 500;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe quantos dias trabalhados.");
        int diasTrabalhados = ler.nextInt();
        double novoSalarioEstagio = salario + 10 * diasTrabalhados;

        System.out.println("Seu salário é: " + novoSalarioEstagio);
        // Método que calcula o salário do Estágio
    }
}

