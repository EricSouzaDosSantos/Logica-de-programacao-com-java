package aula_09.examples;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        File file = new File("/home/eric/IdeaProjects/lopal/src/aula_09/arquivo.txt");
        if (file.exists()){
        System.out.println("Esse arquivo existe");
//        file.delete();
        }else {
            System.out.println("Arquivo não existe");
        }
        try {
            if (file.createNewFile()){
                System.out.println("O Arquivo foi criado com o seguinte nome "+file.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
