package aula_04;
import java.util.Scanner;

public class Cardapio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcao;
        boolean output;

        do {
            System.out.println("---------------------CARDÁPIO--------------------");
            System.out.println("Digite o número de um dos pratos do cardápio:");
            System.out.println("M - Macarão");
            System.out.println("SN - Strogonoff");
            System.out.println("SH - Sushi");
            opcao = sc.nextLine().toUpperCase();
            System.out.println(opcao);
            output = opcao == "M" ;
            System.out.println(output);
        }while(!output);

        switch (opcao){

            case "M":
                System.out.println("Seu Macarrão ficará pronto dentro de 20 minutos");
                break;

            case "SN":
                System.out.println("Seu Strogonoff ficará pronto dentro de 45 minutos");
                break;

            case "SH":
                System.out.println("Seu Sushi ficará pronto dentro de 10 minutos");
                break;
            default:
                System.out.println("Opção indisponivel");
        }



    }
}
