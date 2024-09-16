package Aula_02;

public class DiferenceInDataTypes {
        private short shortValue;
        private int intValue;
        private byte byteValue;

        public DiferenceInDataTypes(short shortValue) {
            this.shortValue = shortValue;
            this.intValue = shortValue;
            this.byteValue = (byte) shortValue;
        }

        public void printValues() {
            System.out.println("Valor do tipo short: " + shortValue);
            System.out.println("Valor do tipo int (com casting implícito): " + intValue);
            System.out.println("Valor do tipo byte (com casting explícito): " + byteValue);
        }
}
