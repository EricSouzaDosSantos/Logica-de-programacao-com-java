package aula_06;

import java.util.Scanner;

public class Note0to10 {
    public static void main(String[] args) {
        int note = 0;
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite sua nota:");
            if (scanner.hasNextInt()){
                note = scanner.nextInt();
                if (note >= 0 && note <= 10) {
                    exit = false;
                }else {
                    System.out.println("Erro: Digite um número entre 0 e 10");
                    exit = true;
                }
            }else {
                System.out.println("Erro: Digite sua nota novamente");
                scanner.next();
                exit = true;
            }
        }while (exit);

        System.out.println("Você digitou corretamente");
        System.out.println("sua nota é de "+note);

    }
}
