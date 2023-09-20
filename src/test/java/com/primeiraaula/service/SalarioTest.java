package com.primeiraaula.service;


import com.primeiraaula.domain.Rh;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class SalarioTest {

    @Test
    public void testarSalario() {

        Rh rh = new Rh();

        rh.teste();
        rh.calcularSalario("CLT", 1000.00);
        rh.calcularSalario("PJ", 800.00);
        rh.calcularSalario("ESTAGIO", 500.00);

        Scanner entrada = new Scanner(System.in);

        boolean calcularSalario = true;

        while (calcularSalario) {
            System.out.println("Escolha uma modalidade");
            System.out.println("[1] PJ");
            System.out.println("[2] CLT");
            System.out.println("[3] Estagio");
            System.out.println("[4] Parar");

            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(Rh.pjSalario());
                    break;
                case 2:
                    System.out.println(Rh.cltSalario());
                    break;
                case 3:
                    System.out.println(Rh.estagioSalario());
                    break;
                case 4:
                    return;
            }

        }
    }
}
