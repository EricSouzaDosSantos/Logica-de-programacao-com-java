package Aula_02;

public class CastingExplicitAndImplicit {
    private float floatValue;
    private long longValue;
    private double doubleValue;

    // Construtor
    public CastingExplicitAndImplicit(float floatValue) {
        this.floatValue = floatValue;
        this.longValue = (long) floatValue;
        this.doubleValue = longValue;
    }

    public void printValues() {
        System.out.println("Valor do tipo float: " + floatValue);
        System.out.println("Valor do tipo long (com casting explícito): " + longValue);
        System.out.println("Valor do tipo double (com casting implícito): " + doubleValue);
    }

}
