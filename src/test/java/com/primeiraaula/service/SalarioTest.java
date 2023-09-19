package com.primeiraaula.service;


import com.primeiraaula.domain.Rh;
import org.junit.jupiter.api.Test;

public class SalarioTest {

    @Test
    public void testarSalario(){

        Rh rh = new Rh();

        rh.teste();
        rh.calcularSalario("CLT", 1000.00);
        rh.calcularSalario("PJ", 500.00);
        rh.calcularSalario("ESTAGIO", 800.00);

    }
}
