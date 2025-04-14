package Es10;

// Classe Film che estende Media
public class Film extends Media{
    private String regista;
    private String[] attori;
    private String genere;

    public Film(String titolo, int annoPubbl, String codiceID, int durata, String regista, String[] attori, String genere) {
        super(titolo, annoPubbl, codiceID, durata);
        this.regista = regista;
        this.attori = attori;
        this.genere = genere;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduco il film: " + getTitolo() + " di " + regista);
    }

    public String getRegista() {
        System.out.println("Restituisco il regista del film: " + regista);
        return regista;
    }

    public String[] getAttori() {
        System.out.println("Restituisco gli attori del film: " + String.join(", ", attori));
        return attori;
    }

    public String getGenere() {
        System.out.println("Restituisco il genere del film: " + genere);
        return genere;
    }
}
