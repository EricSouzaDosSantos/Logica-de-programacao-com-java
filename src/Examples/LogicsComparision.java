package Examples;

public class LogicsComparision {

    private int value1;

    private int value2;

    private boolean condition1 = value1 > value2;

    private boolean condition2 = value1 != value2;

    private boolean Condition3 = value1 <= value2;

    private boolean operatorns;

    public void LogicCondition(){
        operatorns = condition1 && condition2;
        System.out.println("A primeira condição e a segunda condição são verdadeiras "+operatorns);
        operatorns = condition1 || condition2;
        System.out.println("uma das condições são verdadeiras "+operatorns);
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
