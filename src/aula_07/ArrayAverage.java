package aula_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayAverage {

    private double[] arrayNum =  new double[4];
    private double numberSum = 0;
    private Scanner scanner = new Scanner(System.in);
    private boolean enter = true;
    private DecimalFormat df = new DecimalFormat("#,##0.00");


    public void saveDataAndCalculatorAverage(){

        for (int i = 0; i < arrayNum.length; i++) {
            do {
                System.out.println("Digite um número para guardar no array");
                if (scanner.hasNextDouble()) {
                    arrayNum[i] = scanner.nextDouble();
                    enter = false;
                }else {
                    System.out.println("Erro: Digite novamente");
                    enter = true;
                    scanner.next();
                }
            }while (enter);

            numberSum +=  arrayNum[i];

        }

        System.out.println("o resultado da média desse array é de: "+df.format(numberSum/ arrayNum.length));
    }
}
