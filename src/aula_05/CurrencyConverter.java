package aula_05;

public class CurrencyConverter {

    private final double taxaDolar = 5.30;
    private final double taxaEuro = 5.60;
    private final double taxaLibra = 6.30;

    public double converter(double valorReais, int codigoMoeda) {
        switch (codigoMoeda) {
            case 1:
                return valorReais / taxaDolar;
            case 2:
                return valorReais / taxaEuro;
            case 3:
                return valorReais / taxaLibra;
            default:
                return -1;
        }
    }

    public String obterNomeMoeda(int codigoMoeda) {
        switch (codigoMoeda) {
            case 1:
                return "Dólares";
            case 2:
                return "Euros";
            case 3:
                return "Libras";
            default:
                return "Moeda Desconhecida";
        }
    }
}
