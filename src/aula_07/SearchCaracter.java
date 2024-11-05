package aula_07;

import java.util.Scanner;

public class SearchCaracter {
    private String[] caracter = new String[6];
    Scanner scanner = new Scanner(System.in);

    public SearchCaracter(){

    }

    public void insertCaracter(){
        for (int i = 0; i < caracter.length; i++) {

            caracter[i] = scanner.nextLine();


        }
    }
}
