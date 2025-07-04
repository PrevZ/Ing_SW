package Es9;

// Classe EsameOrale che estende Esame e implementa Valutabile
public class EsameOrale extends Esame implements Valutabile {
    private int durata;

    public EsameOrale(String data, int votoFinale, int durata) {
        super(data, votoFinale);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public void calcolaVoto() {
        System.out.println("Calcolo il voto dell'esame orale");
    }
    
}
