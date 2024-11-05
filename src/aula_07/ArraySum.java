package aula_07;

import java.util.Scanner;

public class ArraySum {

    private int[] arrayNum =  new int[5];
    private int numberSum = 0;
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;

    public void savedataAndSum(){

        for (int i = 0; i < arrayNum.length; i++) {
            do {
                System.out.println("Digite um número para guardar no array");
                if (scanner.hasNextInt()) {
                    arrayNum[i] = scanner.nextInt();
                    enter = false;
                }else {
                    System.out.println("Erro: Digite novamente");
                    enter = true;
                    scanner.next();
                }
            }while (enter);

              numberSum +=  arrayNum[i];

        }

        System.out.println("o resultado da soma desse array é de: "+numberSum);
    }
}
