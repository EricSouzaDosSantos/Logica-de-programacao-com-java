package aula_06;

public class WhileSum {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        while (counter <= 100){
            counter++;
            if (counter % 2 == 0){
                int atual = sum;
                System.out.println("a soma de "+counter+" + "+sum+" = "+(counter + sum));
                sum += counter;

            }
        }
        System.out.println(sum);

    }
}
