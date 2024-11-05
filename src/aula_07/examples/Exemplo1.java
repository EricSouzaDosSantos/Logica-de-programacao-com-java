package aula_07.examples;

public class Exemplo1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("O primeiro elemento do vetor é: " + numeros[0]);



        //--------matriz---------
        int [][] matriz = new int[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[2][1] = 5;
        matriz[3][2] = 6;

        System.out.println("O primeiro elemento da matriz é: " + matriz[0][0]);

    }
}
