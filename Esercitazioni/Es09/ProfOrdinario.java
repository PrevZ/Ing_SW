package Es9;

// Classe ProfOrdinario che estende Professore
public class ProfOrdinario extends Professore{
    private int annoRuolo;

    public ProfOrdinario(String nome, String cognome, String codiceFiscale, String ufficio, Dipartimento dipartimento, int annoRuolo) {
        super(nome, cognome, codiceFiscale, ufficio, dipartimento);
        this.annoRuolo = annoRuolo;
    }

    public int getAnnoRuolo() {
        System.out.println("Restituisco l'anno di ruolo: " + annoRuolo);
        return annoRuolo;
    }
}
