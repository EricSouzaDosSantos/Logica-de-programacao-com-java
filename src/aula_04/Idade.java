package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int idade;
        String classificacao;

            System.out.println("Qual a sua idade??");
            idade = sc.nextInt();


        if (idade < 13) {
            classificacao = "criança";
            System.out.println("Você é uma "+classificacao);
        }
        else if (idade < 18) {
            classificacao = "adolescente";
            System.out.println("Você é um "+classificacao);
        }
        else if (idade < 65) {
            classificacao = "adulto";
            System.out.println("Você é um "+classificacao);
        }
        else if (idade >= 65) {
            classificacao = "idoso";
            System.out.println("Você é um "+classificacao);
        }

    }
}
