package Es9;

// Classe ProfContratto che estende Professore
public class ProfContratto extends Professore{
    private int durataContratto; 
    private double tariffa;

    public ProfContratto(String nome, String cognome, String codiceFiscale, String ufficio, Dipartimento dipartimento, int durataContratto, double tariffa) {
        super(nome, cognome, codiceFiscale, ufficio, dipartimento);
        this.durataContratto = durataContratto;
        this.tariffa = tariffa;
    }

    public int getDurataContratto() {
        System.out.println("Restituisco la durata del contratto: " + durataContratto);
        return durataContratto;
    }

    public double getTariffa() {
        System.out.println("Restituisco la tariffa: " + tariffa);
        return tariffa;
    }
}
