package aula_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String semafaro;


        do {
            System.out.println("Escreva a cor que está no semafaro?");
            System.out.println("Verde");
            System.out.println("Vermelho");
            System.out.println("Amarelo");
            semafaro = sc.next().toUpperCase();
        } while (!(semafaro.contains("VERDE") || semafaro.contains("VERMELHO") || semafaro.contains("AMARELO")));

        switch (semafaro) {

            case "VERDE":
                System.out.println("O semafaro está verde então os carros podem passar e os pedrestes esperam");
                break;
            case "VERMELHO":
                System.out.println("O semafaro está Vermelho os carros param e os pedrestes podem passar");
                break;
            case "AMARELO":
                System.out.println("O semafaro está amarelo os carros diminuem a velocidade e os pedrestes esperam o semafaro ficar vermelho");
                break;
            default:
                System.out.println("Digite novamente a cor do semafaro");
        }

    }
}