package aula_09.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example7 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\arquivo.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nTexto escrito no arquivo com buffer com modulo append");
            bufferedWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}