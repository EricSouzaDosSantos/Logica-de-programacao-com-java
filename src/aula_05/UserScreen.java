package aula_05;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class UserScreen {

    public UserScreen() {

    }

    public void printOptions() {

        Scanner scanner = new Scanner(System.in);
        boolean enter = true;
        boolean entryDoWhile = false;
        int option = 0;

        while (enter) {

            do {

                System.out.println("--------------------------------------------------------------");
                System.out.println("Digite qual das opções você deseja acessar:");
                System.out.println("1 - Verificar se um usuário tem acesso pela idade");
                System.out.println("2 - Desconto na compra");
                System.out.println("3 - Categoria do produto");
                System.out.println("4 - Valor da sua comissão");
                System.out.println("5 - Valor da hora extra");
                System.out.println("6 - Situação do aluno");
                System.out.println("7 - Operações matemáticas");
                System.out.println("8 - avaliação do funcionário");
                System.out.println("9 - Sair");
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    entryDoWhile = true;
                } else {
                    System.out.println("Erro: Você deve digitar o número de uma das opções abaixo");
                    scanner.next();
                }

            } while (!entryDoWhile);

            switch (option) {
                case 1:
                    System.out.println("Você escolheu a opção 1: Verificar acesso do usuário");

                    System.out.println("Digite seu nome:");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("Digite sua idade " + name);
                    int old = scanner.nextInt();

                    Acess acess = new Acess(old, name);

                    acess.acessControl();
                    break;
                case 2:
                    double purchasesValue = 0;
                    boolean entry = false;
                    System.out.println("Você escolheu a opção 2: Desconto na compra do usuário");

                    do {
                        System.out.println("Qual o valor da sua compra??");
                        if (scanner.hasNextDouble()) {
                            purchasesValue = scanner.nextDouble();
                            entry = true;
                        } else {
                            System.out.println("Erro: Digite um número válido");
                            scanner.next();
                        }
                    } while (!entry);

                    DiscountOnPurchases discountOnPurchases = new DiscountOnPurchases(purchasesValue);

                    discountOnPurchases.Disconunt();
                    break;
                case 3:
                    System.out.println("VocÊ escolheu a opção 3: categorização dos produtos");
                    String[] arrayProducts = {"Carregador de iphone", "Abacaxi", "Bermuda", "Mouse", "Uva", "Blusa"};
                    String product = "";
                    Random productRandom = new Random();
                    entry = false;
                    int category = 0;


                    do {
                        System.out.println("Adicione os produtos em suas categorias digitando o número de sua categoria");
                        System.out.println("1 - Eletrônico");
                        System.out.println("2 - Alimentos");
                        System.out.println("3 - Vestuarios");

                        product = arrayProducts[productRandom.nextInt(6)];
                        System.out.println("Qual categoria o produto " + product + " pertence");
                        System.out.println("onde o produto acima se encaixa");
                        if (scanner.hasNextInt()) {
                            category = scanner.nextInt();
                            entry = true;
                        } else {
                            System.out.println("Erro: Digite um número válido");
                            scanner.next();

                        }
                    } while (!entry);

                    ProductCategory productCategory = new ProductCategory(category);
                    productCategory.Category(product);

                    break;
                case 4:
                    entry = false;
                    double employeValue = 0;

                    System.out.println("VocÊ escolheu a opção 4: Valor da comissão das suas vendas");

                    do {
                        System.out.println("Digite o valor total de suas vendas em R$");
                        if (scanner.hasNextDouble()) {
                            employeValue = scanner.nextDouble();
                            entry = true;
                        } else {
                            System.out.println("Erro: Digite um número válido");
                            scanner.next();
                        }
                    } while (!entry);

                    Commission commission = new Commission(employeValue);
                    commission.salesComission();

                    break;
                case 5:
                    entry = false;
                    int workingHour = 0;
                    double hourValue = 0;
                    System.out.println("Você escolheu a opção 5: Valor recebido pela hora extra");

                    do {
                        System.out.println("Digite a quantidade de horas trabalhadas na semana anterior");
                        if (scanner.hasNextInt()) {
                            workingHour = scanner.nextInt();

                            System.out.println("Qual o valor de uma hora do seu trabalho");
                            if (scanner.hasNextDouble()) {
                                hourValue = scanner.nextDouble();
                                entry = true;
                            } else {
                                System.out.println("Erro: numero inválido para valor da sua hora de trabalho");
                                scanner.next();
                            }
                        } else {
                            System.out.println("Erro: numero inválido para qunatidade de horas trabalhadas");
                            scanner.next();
                        }

                    } while (!entry);

                    Overtime overtime = new Overtime(workingHour, hourValue);
                    overtime.overtimePayment();
                    break;

                case 6:
                    entry = false;
                    String nameStudent = "";
                    int noteStudent = 0;
                    System.out.println("Você escolheu a opção 6: Situação do aluno");

                    do {
                        System.out.println("Qual o seu nome:");
                        scanner.nextLine();
                        nameStudent = scanner.nextLine();

                        System.out.println("Qual sua nota " + nameStudent + " (a nota deve ser entre 0 e 10):");
                        if (scanner.hasNextInt()) {
                            noteStudent = scanner.nextInt();
                            if (noteStudent >= 0 && noteStudent <= 10) {
                                entry = true;
                            } else {
                                System.out.println("Erro: a nota deve ser entre 0 e 10");
                            }
                        } else {
                            System.out.println("Erro: entre com um numero válido");
                        }
                    } while (!entry);

                    Student student = new Student(nameStudent, noteStudent);

                    student.Situation();

                    break;

                case 7:

                    entry = false;
                    int num1 = 0;
                    int num2 = 0;
                    int operation = 0;
                    System.out.println("Você escolheu a opção 7: Operações matemáticas");
                    do {

                        System.out.println("Digite qual dessas operações você deseja");
                        System.out.println("1 - Soma");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão");
                        System.out.println("5 - Resto de divisão");

                        if (scanner.hasNextInt()) {
                            operation = scanner.nextInt();

                            System.out.println("Digite o primeiro numero");

                            if (scanner.hasNextInt()) {

                                num1 = scanner.nextInt();
                                System.out.println("Digite o segundo número");

                                if (scanner.hasNextInt()) {

                                    num2 = scanner.nextInt();
                                    entry = true;

                                } else {

                                    System.out.println("Erro: Segundo número inválido");
                                    scanner.next();

                                }
                            } else {

                                System.out.println("Erro: primeiro número inválido");
                                scanner.next();

                            }
                        } else {

                            System.out.println("Erro: operação não disponivel");
                            scanner.next();

                        }

                    } while (!entry);

                    MathematicalOperations mathematicalOperations = new MathematicalOperations(operation, num1, num2);

                    mathematicalOperations.operation();

                    break;

                case 8:



                    break;

                case 9:

                    TurnHour horario = new TurnHour();

                    System.out.print("Digite a hora atual (formato 24 horas): ");
                    int horaAtual = scanner.nextInt();

                    horario.setHora(horaAtual);
                    String turno = horario.determinarTurno();

                    System.out.println("O turno correspondente é: " + turno);
                    break;

                case 10:

                    CurrencyConverter conversor = new CurrencyConverter();

                    System.out.print("Digite o valor em reais: ");
                    double valorReais = scanner.nextDouble();

                    System.out.println("Escolha o código da moeda para conversão: ");
                    System.out.println("1 - Dólar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Libra");
                    int codigoMoeda = scanner.nextInt();

                    double valorConvertido = conversor.converter(valorReais, codigoMoeda);
                    String moeda = conversor.obterNomeMoeda(codigoMoeda);

                    DecimalFormat df = new DecimalFormat("#,##0.00");
                    if (valorConvertido != -1) {
                        System.out.println("O valor convertido em " + moeda + " é: " + df.format(valorConvertido));
                    } else {
                        System.out.println("Código de moeda inválido.");
                    }
                    break;

                case 11:
                    System.out.println("Saindo....");
                    enter = false;
                    break;
            }
        }
    }
}
