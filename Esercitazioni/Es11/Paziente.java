package Es11;

import java.util.*;

public class Paziente extends Persona{
    private String codicePaziente;
    private Date dataNascita;
    private CartellaClinica cartellaClinica;

    public Paziente(String nome, String cognome, String codiceFiscale, String codicePaziente, Date dataNascita) {
        super(nome, cognome, codiceFiscale);
        this.codicePaziente = codicePaziente;
        this.dataNascita = dataNascita;
        this.cartellaClinica = new CartellaClinica(codicePaziente, new Date());
    }

    public String getCodicePaziente() {
        return codicePaziente;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public CartellaClinica getCartellaClinica() {
        System.out.println("Restituisco la cartella clinica del paziente: " + getNome() + " " + getCognome());
        return cartellaClinica;
    }

}
