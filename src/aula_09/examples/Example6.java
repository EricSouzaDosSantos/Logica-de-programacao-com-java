package aula_09.examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("src\\Aula08\\textosDosExercicios\\arquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nTexto escrito no arquivo com buffer");
            bufferedWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
