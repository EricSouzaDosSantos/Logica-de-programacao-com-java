package aula_05;

public class Overtime {
    private int workinghours;
    private double hourValue;
    private double extraPayment;

    public Overtime(int workinghours, double hourValue){
        this.workinghours = workinghours;
        this.hourValue = hourValue;
    }

    public void overtimePayment(){
        if(workinghours > 40){
            extraPayment = hourValue * 0.5;
            System.out.println("Você têm direito a horas extras");
            System.out.println("o valor pago pela hora extra é de R$ "+extraPayment);
            System.out.println("Você vai receber a mais no seu salário o valor de R$ "+(workinghours - 40) * extraPayment);
        }
    }



}
