package Es10;

// classe Libro che estende ElementoMultimediale
public class Libro extends ElementoMultimediale {
    private String autore;
    private int numeroPagine;
    private String editore;

    public Libro(String titolo, int annoPublicazione, String codiceID, String autore, int numeroPagine, String editore) {
        super(titolo, annoPublicazione, codiceID);
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.editore = editore;
    }

    public String getAutore() {
        System.out.println("Restituisco l'autore del libro: " + autore);
        return autore;
    }

    public int getNumeroPagine() {
        System.out.println("Restituisco il numero di pagine del libro: " + numeroPagine);
        return numeroPagine;
    }

    public String getEditore() {
        System.out.println("Restituisco l'editore del libro: " + editore);
        return editore;
    }
}
