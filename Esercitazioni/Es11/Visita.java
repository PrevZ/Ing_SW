package Es11;

import java.util.*;

// Classe Visita
public class Visita {
    private Date data;
    private String diagnosi;
    private Medico medico;
    private Paziente paziente;

    public Visita(Date data, String diagnosi, Medico medico, Paziente paziente) {
        this.data = data;
        this.diagnosi = diagnosi;
        this.medico = medico;
        this.paziente = paziente;
    }

    public Date getData() {
        return data;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paziente getPaziente() {
        return paziente;
    }
}
