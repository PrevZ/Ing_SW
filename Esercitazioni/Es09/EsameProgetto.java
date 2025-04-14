package Es9;

// Classe EsameProgetto che estende Esame e implementa Valutabile
public class EsameProgetto extends Esame implements Valutabile{
    private String scadenza;

    public EsameProgetto(String data, int votoFinale, String scadenza) {
        super(data, votoFinale);
        this.scadenza = scadenza;
    }

    public String getScadenza() {
        return scadenza;
    }

    @Override
    public void calcolaVoto() {
        System.out.println("Calcolo voto per esame progetto...");
    }
}
