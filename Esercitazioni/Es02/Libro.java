

public class Libro extends MaterialeBibliotecario{
    private String autore;

    public Libro(String titolo, int annoPubblicazione, String autore) {
        super(titolo, annoPubblicazione);
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autore: " + autore;
    }
}
