

public abstract class MaterialeBibliotecario {
    private String titolo;
    private int annoPubblicazione;

    public MaterialeBibliotecario(String titolo, int annoPubblicazione) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Anno di Pubblicazione: " + annoPubblicazione;
    }
}
