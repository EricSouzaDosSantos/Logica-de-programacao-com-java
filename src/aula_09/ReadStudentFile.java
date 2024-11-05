package aula_09;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadStudentFile {

    public static void main(String[] args) {
        try {

            FileReader alunosTxt = new FileReader("src//alunos.txt");
            BufferedReader lerAlunos = new BufferedReader(alunosTxt);

            int caracter;

            while ((caracter = lerAlunos.read()) != -1){
                System.out.print((char) caracter);

            }
            lerAlunos.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
