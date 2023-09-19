import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Matheus");
        nomes.add("Daniel");
        nomes.add("Daniel");

        for (int i = 1; i < 10; i++) {
            //System.out.println(i+i);
        }

        for (String n : nomes) {
            //System.out.println(n);
        }

        //nomes.forEach(n -> System.out.println(n));

        Scanner entrada = new Scanner(System.in);

        boolean parar = true;

//        while (parar) {
//            System.out.println("Escolha um campeão");
//            System.out.println("[1] Master Yi");
//            System.out.println("[2] Sona");
//            System.out.println("[3] Karma");
//            System.out.println("[4] Parar");
//
//            int escolha = entrada.nextInt();
//
//            switch (escolha) {
//                case 1:
//                    System.out.println("Boneco cotoco");
//                    break;
//                case 2:
//                    System.out.println("Catapa que toca");
//                    break;
//                case 3:
//                    System.out.println("Suporte de uma skill");
//                    break;
//                case 4:
//                    return;
//            }
//
//        }

        Scanner ent = new Scanner(System.in);


        while (true) {

            System.out.println("Qual time voce torce?");
            String nome = ent.nextLine();

            System.out.println("Para parar digite 1");

            switch (nome) {
                case "Corinthians":
                    System.out.println("Time de gambá");
                    break;
                case "Palmeiras":
                    System.out.println("Sem mundial");
                    break;
                case "1":
                    return;
                default:
                    System.out.println("Time não encontrado!");
                    break;
            }
        }
    }
}
