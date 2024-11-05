package aula_05;

public class MathematicalOperations {

    private int operation;

    private int num1;

    private int num2;

    private int operationCalc = 0;


    public MathematicalOperations(int operation, int num1, int num2){
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void operation(){

        switch (operation){

            case 1:
                operationCalc = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+operationCalc);
                break;
            case 2:
                operationCalc = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+operationCalc);
                break;
            case 3:
                operationCalc = num1 * num2;
                System.out.println(num1+" X "+num2+" = "+operationCalc);
                break;
            case 4:
                operationCalc = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+operationCalc);
                break;
            case 5:
                operationCalc = num1 % num2;
                System.out.println(num1+" % "+num2+" = "+operationCalc);
                break;
            default:
                System.out.println("Erro ao executar o programa");

        }

    }
}
