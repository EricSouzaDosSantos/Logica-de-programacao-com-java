package aula_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcIIMC {

    public static void main(String[] args) {
        double weight, height;
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu peso");
        weight = scanner.nextDouble();
        System.out.println("Qual é a sua altura");
        height = scanner.nextDouble();
        System.out.println("O valor do seu IMC é "+decimalFormat.format(calcularIMC(weight, height)));

    }

    public static double calcularIMC(double weight, double height){
        return weight / (height * height);
    }
}
