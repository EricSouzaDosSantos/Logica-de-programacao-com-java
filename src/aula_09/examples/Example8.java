package aula_09.examples;

public class Example8 {
    public static void main(String[] args) {
        String linha = " Id: 1; Nome: Eric; Idade: 17";

        String[] tokens = linha.split(";");
        for (String token : tokens){
            System.out.println(token);
        }
//        String[] id = tokens[0].split(":");
//        String[] nome = tokens[1].split(":");
//        String[] idade = tokens[2].split(":");
//        System.out.println(id[1]+", "+nome[1]+", "+idade[1]);

        String valores = "";

        for (int i = 0; i < tokens.length; i++) {

            String[] chaveValor = tokens[i].split(":");

            valores += chaveValor[1]+",";
        }
        System.out.println(valores);

        String[] idade = tokens[2].split(":");

        int valorDaIdade = Integer.parseInt(idade[1].trim());

        System.out.println("O valor da idade mais 1 é: "+(valorDaIdade+1));
    }
}
