package aula_09.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Examples2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src//arquivo.txt", true);
            fileWriter.write("\ntexto escrito no modo append abilitado");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
