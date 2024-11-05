package aula_06.examples;

import java.util.Scanner;

public class TestingFor {
    public static void main(String[] args) {
        int impar = 0;
        int par = 0;
        int number;
        String[] pergunta = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo"};
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++){

            System.out.println("Digite o "+pergunta[i]+" número");
            number = scanner.nextInt();
            if(number % 2 == 0){
                par++;
            }else {
                impar++;
            }
        }
        System.out.println("Você digitou "+impar+" numeros impares");
        System.out.println("Você digitou "+par+" numeros pares");
    }
}
