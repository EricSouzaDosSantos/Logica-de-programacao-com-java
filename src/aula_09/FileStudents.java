package aula_09;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileStudents {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File alunos = new File("src//alunos.txt");
            String nome = "";
            if (!alunos.exists()){
                alunos.createNewFile();
            }
            FileWriter nomeAlunos = new FileWriter(alunos, true);
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o nome "+i+": ");
                nome = scanner.nextLine();
                nomeAlunos.write(""+nome+"\n");
            }
            nomeAlunos.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
