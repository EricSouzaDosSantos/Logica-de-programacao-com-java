package aula_05;
import java.util.Random;
import java.util.Scanner;

public class UserScreen {

    public UserScreen(){

    }

    public void printOptions(){

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
                System.out.println("6 - Sair");
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

                    System.out.println("Digite sua idade "+name);
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
                    }while (!entry);

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
                        System.out.println("Qual categoria o produto "+product+" pertence");
                        System.out.println("onde o produto acima se encaixa");
                        if(scanner.hasNextInt()){
                            category = scanner.nextInt();
                            entry = true;
                        }else{
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
                        if(scanner.hasNextDouble()){
                            employeValue = scanner.nextDouble();
                            entry = true;
                        }else {
                            System.out.println("Erro: Digite um número válido");
                            scanner.next();
                        }
                    }while (!entry);

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
                        if(scanner.hasNextInt()){
                            workingHour = scanner.nextInt();

                            System.out.println("Qual o valor de uma hora do seu trabalho");
                            if(scanner.hasNextDouble()){
                                hourValue = scanner.nextDouble();
                                entry = true;
                            }else{
                                System.out.println("Erro: numero inválido para valor da sua hora de trabalho");
                                scanner.next();
                            }
                        }else{
                            System.out.println("Erro: numero inválido para qunatidade de horas trabalhadas");
                            scanner.next();
                        }

                    } while (!entry);

                    Overtime overtime = new Overtime(workingHour, hourValue);
                    overtime.overtimePayment();

                    break;
                case 6:
                    System.out.println("Saindo....");
                    enter = false;
                    break;
            }
        }
    }
}
