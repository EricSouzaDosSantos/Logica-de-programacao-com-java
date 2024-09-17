package aula_05;

public class Commission {

    private double employeeSales;

    private double comission;

    public Commission(double employeeSales){
        this.employeeSales = employeeSales;

    }

    public void salesComission(){
        if(employeeSales < 1000){
            comission = employeeSales * 0.05;
            System.out.println("Você têm direito a uma comissão de 5%, pois vendeu R$ "+employeeSales+" em produtos");
            System.out.println("O valor da sua comissão é de R$ "+comission);
        }else if(employeeSales >= 1000 && employeeSales <= 5000){
            comission = employeeSales * 0.1;
            System.out.println("Você têm direito a uma comissão de 10%, pois vendeu R$ "+employeeSales+" em produtos");
            System.out.println("O valor da sua comissão é de R$ "+comission);
        }else if(employeeSales > 5000){
            comission = employeeSales * 0.15;
            System.out.println("Você têm direito a uma comissão de 15%, pois vendeu R$ "+employeeSales+" em produtos");
            System.out.println("O valor da sua comissão é de R$ "+comission);
        }
    }
}
