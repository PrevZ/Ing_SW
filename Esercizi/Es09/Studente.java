package Es9;

// Classe Studente che estende Persona
public class Studente extends Persona{
    private String matricola;
    private int annoIscrizione;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola, int annoIscrizione) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.annoIscrizione = annoIscrizione;
    }

    public String getMatricola() {
        System.out.println("Restituisco la matricola: " + matricola);
        return matricola;
    }

    public int getAnnoIscrizione() {
        System.out.println("Restituisco l'anno di iscrizione: " + annoIscrizione);
        return annoIscrizione;
    }
}
