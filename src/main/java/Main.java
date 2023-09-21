import com.primeiraaula.domain.Rh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rh rh = new Rh();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma modalidade");
        System.out.println("PJ");
        System.out.println("CLT");
        System.out.println("Estagio");
        System.out.println("Para para digite 0");

        String modalidade = entrada.nextLine();
        System.out.println("Digite o valor do salário");
        double salario = entrada.nextDouble();

        rh.calcularSalario(modalidade, salario);
    }
}
