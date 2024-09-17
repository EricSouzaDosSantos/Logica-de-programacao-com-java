package aula_05;

public class DiscountOnPurchases {

    private double purchasesValue;

    private float discontValue;

    public DiscountOnPurchases(double purchasesValue){
        this.purchasesValue = purchasesValue;

    }

    public void Disconunt(){
        if(purchasesValue >= 100){
            discontValue = 0.1f;
            purchasesValue = purchasesValue - (purchasesValue * discontValue);
            System.out.println("Você recebeu um desconto de 10%, o valor total da sua compra com desconto fica R$ "+purchasesValue);
        }else{
            System.out.println("Você não possui nenhum desconto pague R$ "+purchasesValue);
        }
    }
}
