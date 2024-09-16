package Aula_02;

public class Comparision {

    private int value1;

    private int value2;

    private boolean comparingNumber;

    public Comparision(){

    }

    public void ComparingNumbers(){
        comparingNumber = value1 == value2;
        System.out.println(value1+" é igual "+value2+": "+comparingNumber);
        comparingNumber = value1 != value2;
        System.out.println(value1+" é diferente "+value2+": "+comparingNumber);
        comparingNumber = value1 > value2;
        System.out.println(value1+" é maior "+value2+": "+comparingNumber);
        comparingNumber = value1 < value2;
        System.out.println(value1+" é menor "+value2+": "+comparingNumber);
        comparingNumber = value1 >= value2;
        System.out.println(value1+" é maior ou igual "+value2+": "+comparingNumber);
        comparingNumber = value1 <= value2;
        System.out.println(value1+" é menor ou igual "+value2+": "+comparingNumber);
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
