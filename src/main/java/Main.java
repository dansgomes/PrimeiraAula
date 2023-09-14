import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, qual seu nome?");
        //nextLine() é pra String
        String nome = entrada.nextLine();

        if(nome.equalsIgnoreCase("Rafael")){
            System.out.println("Hmmm nome bonito!");
        }else {
            System.out.println("Hmmm não gostei!!");
        }

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Minha idade é "+idade);


    }
}
