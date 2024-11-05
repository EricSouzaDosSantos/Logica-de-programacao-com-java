package aula_09;

import java.io.*;

public class ReadAndWrite {

    public static void main(String[] args) {
        try{

            FileReader lerArquivo = new FileReader("src//alunos.txt");
            BufferedReader bufferedLerArquivo = new BufferedReader(lerArquivo);
            FileWriter escreverNoArquivo = new FileWriter("src//backup_alunos.txt", true);
            BufferedWriter bufferedEscreverArquivo = new BufferedWriter(escreverNoArquivo);
            int caracter;
            String nomes = "";
            while ((caracter = bufferedLerArquivo.read()) != -1){
                nomes += (char) caracter;
            }
            bufferedEscreverArquivo.write(nomes);

            lerArquivo.close();
            bufferedLerArquivo.close();

            bufferedEscreverArquivo.close();
            escreverNoArquivo.close();

        } catch (FileNotFoundException e) {
            throw  new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
