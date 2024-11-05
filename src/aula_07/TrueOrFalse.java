package aula_07;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueOrFalse {

    private ArrayList<Boolean> truth = new ArrayList<>();
    private ArrayList<Boolean> falses = new ArrayList<>();
    private boolean[] vetorBoolean = new boolean[8];
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;

    public TrueOrFalse(){}

    public void saveValuesTrueOrFalse(){
        for (int i = 0; i < vetorBoolean.length; i++) {
            do {
                System.out.println("Digite um valor verdadeiro ou falso(true or false):");
                if (scanner.hasNextBoolean()) {
                    vetorBoolean[i] = scanner.nextBoolean();

                    if (vetorBoolean[i] == true) {
                        truth.add(vetorBoolean[i]);
                    } else {
                        falses.add(vetorBoolean[i]);
                    }

                    enter = false;
                }else {
                    System.out.println("Erro: Digite novamente");
                    enter = true;
                    scanner.next();
                }
            }while (enter);

        }
        System.out.println("Você digitou "+truth.size()+" valores verdadeiros");
        System.out.println("Verdadeiro: "+truth);
        System.out.println("E digitou "+falses.size()+" valores falsos");
        System.out.println("Falso: "+falses);
    }
}
