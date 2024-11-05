package aula_05;

public class TurnHour {
    private int hora;

    public void TurnHour(){


    }
    public String determinarTurno() {
        if (hora >= 5 && hora < 12) {
            return "Manhã";
        } else if (hora >= 12 && hora < 18) {
            return "Tarde";
        } else if (hora >= 18 && hora < 22) {
            return "Noite";
        } else {
            return "Madrugada";
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora inválida. Insira uma hora entre 0 e 23.");
        }
    }
}
