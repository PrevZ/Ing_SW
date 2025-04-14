package Es9;

// Classe EsameScritto che estende Esame e implementa Valutabile
public class EsameScritto extends Esame implements Valutabile{
    private int numeroDomande;

    public EsameScritto(String data, int votoFinale, int numeroDomande) {
        super(data, votoFinale);
        this.numeroDomande = numeroDomande;
    }

    public int getNumeroDomande() {
        return numeroDomande;
    }

    @Override
    public void calcolaVoto() {
        System.out.println("Calcolo voto per esame scritto...");
    }
}
