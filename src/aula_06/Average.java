package aula_06;

import java.util.Arrays;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] note = new int[5];
        double average = 0;
        String[] question = {"primeira", "segunda", "terceira", "quarta", "última"};

        for (int i = 0; i < note.length; i++) {
            System.out.println("Digite a "+question[i]+" nota do aluno(a):");
            note[i] = scanner.nextInt();
            average = (note[0] + note[1] + note[2] + note[3] + note[4]) / 5;
        }
        System.out.println("a média do aluno foi de "+average);

    }
}
