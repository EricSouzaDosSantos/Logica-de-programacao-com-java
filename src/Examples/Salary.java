package Examples;

public class Salary {

    int hourWorked;

    int amountPain;

    int daysWorked;

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public String CalcSalario(int hourWorked, int amountPain, int daysWorked){
        int salario = (amountPain * hourWorked) * daysWorked;

        return "trabalhando "+daysWorked+" dias no mês e "+hourWorked+" por dia você irá receber por mês "+salario;
    }

    public Salary(){
        this.hourWorked = hourWorked;
        this.amountPain = amountPain;
    }

    public int getAmountPain() {
        return amountPain;
    }

    public void setAmountPain(int amountPain) {
        this.amountPain = amountPain;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }
}
