package Es10;

// Classe Media che estende ElementoMultimediale e implementa Riproducibile
public class Media extends ElementoMultimediale implements Riproducibile{
    private int durata;

    public Media(String titolo, int annoPubblicazione, String codiceID, int durata) {
        super(titolo, annoPubblicazione, codiceID);
        this.durata = durata;
    }

    @Override
    public int getDurata() {
        System.out.println("Restituisco la durata del media: " + durata);
        return durata;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduco il media: " + getTitolo());
    }
}
