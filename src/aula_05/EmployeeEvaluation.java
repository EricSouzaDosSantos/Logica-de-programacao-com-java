package aula_05;

import java.util.Random;

public class EmployeeEvaluation {

    private String[] employee = {"Eduardo", "Rafaela", "Rafael", "Gabriel", "Beatriz", "Gustavo"};

    private int performance;

    public EmployeeEvaluation(){
    }

    public void avaliation(int numberAvaliation){

        Random random = new Random();
        String employeeRandom = employee[random.nextInt(5)];

        System.out.println("Avalie o atendimento do funcionario(a) "+employeeRandom+" de 1 a 5");
        System.out.println("1 - Precisa melhorar");
        System.out.println("2 - abaixo da média");
        System.out.println("3 - Média");
        System.out.println("4 - Acima da média");
        System.out.println("5 - Excelente");

        switch (numberAvaliation){
            case 1:
            System.out.println("vamos conversar com o(a) funcionario(a) "+employeeRandom+" a respeito de seu atendimento");
                System.out.println("nos desculpe por qualquer trastorno, e obrigado pela ssua avaliação");
            break;
            case 2:
                System.out.println("vamos conversar com o(a) funcionario(a) "+employeeRandom+" a respeito de seu atendimento, e esperamos que ele tenha uma possivel melhora");
                System.out.println("nos desculpe por qualquer trastorno, e obrigado pela ssua avaliação");
                break;
            case 3:
                System.out.println("vamos conversar com o(a) funcionario(a) "+employeeRandom+" sobre o seu atendimento" +
                        "");
                System.out.println("nos desculpe por qualquer trastorno, e obrigado pela ssua avaliação");

                break;
        }

    }
}
