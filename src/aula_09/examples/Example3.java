package aula_09.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try {

            File file = new File("src//arquivo.txt");

            if (file.exists()) {
                FileReader fileReader = new FileReader("src//arquivo.txt");
                int caracter;

                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
            }else {
                file.createNewFile();
                System.out.println("Arquivo criado com sucesso");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
