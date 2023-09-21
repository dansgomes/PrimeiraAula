package com.primeiraaula.service;


import com.primeiraaula.domain.Rh;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class SalarioTest {

    @Test
    public void testarSalarioPJ() {


        Rh rh = new Rh();

        Assertions.assertEquals(1080.00, rh.pjSalario(1000.00));

    }
}
