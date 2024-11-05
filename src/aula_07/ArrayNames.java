package aula_07;

import java.util.Scanner;

public class ArrayNames {

    private String[] names = new String[3];
    String searchName;
    Scanner scanner = new Scanner(System.in);

    public ArrayNames(){}

    public void saveNames(){

        for (int i = 0; i < names.length; i++) {

            System.out.println("Digite um nome:");
            names[i] = scanner.nextLine();
        }
    }

    public void searchNames() {

        System.out.println("Procure um nome ");
        searchName = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)){
                System.out.println("nome encontrado no indice "+i);
                break;
            }else{
                System.out.println("Nome não encontrado");
                break;
            }
        }
    }

}
