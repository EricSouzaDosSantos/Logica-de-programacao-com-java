package aula_09.examples;

import java.io.File;
import java.io.FileReader;

public class Example5 {
    public static void main(String[] args) {
        try {
            File arquivo = new File("src\\Aula08\\textosDosExercicios\\arquivo2.txt");
            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(arquivo);
                int caracter;
                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
            }else {
                arquivo.createNewFile();
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
