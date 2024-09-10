import Examples.*;

import java.util.Scanner;

public class UserScreen {

    public UserScreen(){

    }

    public void Execute() {

        int r = 0, a = 10, b = 90;
        boolean comp;
        Scanner scanner = new Scanner(System.in);
        boolean enter = true;

        while (enter) {

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Digite o número de uma das opções abaixo:");
            System.out.println("1 - Como funcionam as variaveis e operadores");
            System.out.println("2 - Como o Casting funciona");
            System.out.println("3 - Criar um aluno com seu curso e gerar um id aleatorio para ele");
            System.out.println("4 - Inserir dados de uma pessoa");
            System.out.println("5 - Valor do sálario");
            System.out.println("6 - Como funciona o casting implicito");
            System.out.println("7 - Como funciona o casting explicito");
            System.out.println("8 - Testando o resultado de operadores de comparação");
            System.out.println("9 - Testando o resultado de operadores de lógicos");
            System.out.println("12 - Sair do programa");
            System.out.println();

            switch (scanner.nextInt()) {

                case 1:
                    System.out.println("As variaveis começam com os seguintes valores:");
                    System.out.println("r = " + r);
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);

                    System.out.println("-----------------------Operadores aritméticos-----------------------------");

                    r = a + b;
                    System.out.println(a + " + " + b + " = " + r);
                    r = a - b;
                    System.out.println(a + " - " + b + " = " + r);
                    r = a * b;
                    System.out.println(a + " X " + b + " = " + r);
//        r /= a / b;
//        System.out.println(a+" / "+b+" = "+r);
                    r = a % b;
                    System.out.println(a + " % " + b + " = " + r);

                    System.out.println("-----------------------Operadores de comparação-----------------------------");

                    comp = a < b;
                    System.out.println(a + " < " + b + " = " + comp);
                    comp = a > b;
                    System.out.println(a + " > " + b + " = " + comp);
                    comp = a <= b;
                    System.out.println(a + " <= " + b + " = " + comp);
                    comp = a >= b;
                    System.out.println(a + " >= " + b + " = " + comp);
                    comp = a == b;
                    System.out.println(a + " == " + b + " = " + comp);
                    comp = a != b;
                    System.out.println(a + " != " + b + " = " + comp);

                    System.out.println("-----------------------Operadores especiais-----------------------------");

                    int result = 1;

                    result += 2;
                    System.out.println("1 + 2 = " + result);
                    result -= 2;
                    System.out.println("1 - 2 = " + result);
                    result *= 2;
                    System.out.println("1 * 2 = " + result);
                    result /= 2;
                    System.out.println("1 / 2 = " + result);
                    result %= 2;
                    System.out.println("1 % 2 = " + result);

                    System.out.println("-----------------------The End-----------------------------");

                    break;

                case 2:

                    long numLong = 100;
                    int numInt = 10;
                    short numShort = 130;
                    byte numByte = 120;

                    //Casting implicito
                    numLong = numInt;
                    numInt = numShort;
                    numShort = numByte;
                    numLong = numByte;
                    numLong = numShort;

                    //Casting explicito
                    numByte = (byte) 150;
                    numShort = (short) 150;

                    System.out.println(numByte);
                    System.out.println(numShort);

                    numInt = (int) 32.45f;

                    System.out.println(numInt);

                    float numFloat = 150.0f;
                    double numDouble = 210.320;

                    numDouble = numFloat;
                    numFloat = (float) numDouble;

                    System.out.println(numFloat);

                    numFloat = (float) 10000000876452342373654000000.85;

                    System.out.println(numFloat);
                    break;

                case 3:
                    Senai aluno = new Senai();

                    System.out.println("Qual o nome do aluno:");
                    aluno.setNome(scanner.next());

                    System.out.println("Qual o curso do aluno:");
                    aluno.setCurso(scanner.next());

                    System.out.println("Qual a nota da sua primeira prova: ");
                    aluno.setNota1(scanner.nextInt());

                    System.out.println("Qual a nota da sua segunda prova: ");
                    aluno.setNota2(scanner.nextInt());

                    System.out.println("Qual a nota da sua terceira prova: ");
                    aluno.setNota3(scanner.nextInt());

                    System.out.println("O Aluno: " + aluno.getNome() + " está devidamente matriculado no curso de " + aluno.getCurso() + " com a seguinte matricula " + aluno.getMatricula());
                    System.out.println("Soma da nota de suas provas " + aluno.Soma());

                    break;

                case 4:
                    System.out.println("Você selecionou a opção 4");
                    People people = new People();

                    System.out.println("Digite o nome da pessoa");
                    people.setName(scanner.next());

                    System.out.println("Digite a altura da pessoa");
                    people.setHeight(scanner.nextFloat());

                    System.out.println("Digite o peso da pessoa");
                    people.setWeight(scanner.nextDouble());

                    System.out.println("Digite a idade da pessoa");
                    people.setOld(scanner.nextInt());

                    System.out.println(people);
                    break;

                case 5:

                    System.out.println("Você selecionou a opção 5");

                    Salary salary = new Salary();

                    System.out.println("Você trabalha quantos dias no mês:");
                    salary.setDaysWorked(scanner.nextInt());

                    System.out.println("Qual o valor da sua hora:");
                    salary.setAmountPain(scanner.nextInt());

                    System.out.println("Quantas horas você trabalha por dia:");
                    salary.setHourWorked(scanner.nextInt());

                    System.out.println(salary.CalcSalario(salary.getHourWorked(), salary.getAmountPain(), salary.getDaysWorked()));


                    break;

                case 6:

                    System.out.println("Você selecionou a opção de 6 cating implicito");

                    CastingImplicit castingImplicit = new CastingImplicit();

                    System.out.println("Digite um número inteiro");
                    castingImplicit.setValueInt(scanner.nextInt());
                    castingImplicit.setValueDouble(castingImplicit.getValueInt());

                    System.out.println("A variavel double irá ficar com o valor de " + castingImplicit.getValueDouble());
                    System.out.println("já a variável int irá ficar com o valor de " + castingImplicit.getValueInt());

                    break;

                case 7:

                    System.out.println("Você seleciounou a opção 7 de casting explicito");

                    CastingExplicit castingExplicit = new CastingExplicit();

                    System.out.println("Digite o valor da variavel em double");
                    castingExplicit.setValueDouble(scanner.nextDouble());
                    castingExplicit.setValueInt((int) castingExplicit.getValueDouble());

                    System.out.println("O valor da variavel em int ficaria assim " + castingExplicit.getValueInt());
                    System.out.println("E o valor da variavel em double ficaria da seguinte forma " + castingExplicit.getValueDouble());
                    ;

                    break;

                case 8:

                    System.out.println("VocÊ selecionou a opção 8 de Testando operadores");

                    Comparision comparision = new Comparision();

                    System.out.println("Digite um valor em inteiro");
                    comparision.setValue1(scanner.nextInt());

                    System.out.println("Digite outro valor em número inteiro");
                    comparision.setValue2(scanner.nextInt());

                    comparision.ComparingNumbers();


                    break;

                case 9:

                    System.out.println("Você escolheu a opção 9");

                    LogicsComparision logic = new LogicsComparision();

                    System.out.println("Digite o primeiro valor que vai ser comparado");
                    logic.setValue1(scanner.nextInt());

                    System.out.println("Digite o segundo valor que será comparado");
                    logic.setValue2(scanner.nextInt());

                    logic.LogicCondition();

                    break;

                case 10:

                    System.out.println("Você escolheu a opção 10");

                    rectangle rectangle = new rectangle();

                    System.out.println("Qual a altura do retângulo?");
                    rectangle.setHeight(scanner.nextFloat());

                    System.out.println("Qual a largura do retângulo?");
                    rectangle.setWidth(scanner.nextFloat());

                    System.out.println("A área do seu retângulo é " + rectangle.CalcAreaRetangulo());


                    break;

                case 11:

                    break;
                case 12:
                    enter = false;
                    System.out.println("Saindo...");

                    break;
            }
        }
    }
}
