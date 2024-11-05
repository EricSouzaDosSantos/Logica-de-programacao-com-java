package aula_06;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRandom = random.nextInt(100);
        int chute = 0;
        boolean exit = true;
        int tentativas = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("O número já foi sorteado");
        do {
            System.out.println("chute algum número");
            if (scanner.hasNextInt()){
                chute = scanner.nextInt();
                if(chute < numberRandom){
                    System.out.println("O número chutado é maior do que o número sorteado");
                    tentativas+= 1;
                }else if(chute > numberRandom){
                    System.out.println("o numero chutado é menor do que o número sorteado");
                    tentativas+= 1;
                } else if (chute == numberRandom) {
                    System.out.println("Parabéns você acertou o número");
                    exit = false;
                }else {
                    System.out.println("Erro: número inválido");
                    scanner.next();
                }
            }else {
                System.out.println("Erro: número inválido");
                scanner.next();
            }
        }while (exit);
        System.out.println("antes de acertar você tentou "+tentativas+ " vezes");
    }
}
