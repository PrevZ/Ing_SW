package Es10;

// Classe astratta ElementoMultimediale
public abstract class ElementoMultimediale {
    private String titolo;
    private int annoPublicazione;
    private String codiceID;

    public ElementoMultimediale(String titolo, int annoPublicazione, String codiceID) {
        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.codiceID = codiceID;
    }

    public String getTitolo() {
        System.out.println("Restituisco il titolo dell'elemento: " + titolo);
        return titolo;
    }

    public int getAnnoPublicazione() {
        System.out.println("Restituisco l'anno di pubblicazione dell'elemento: " + annoPublicazione);
        return annoPublicazione;
    }

    public String getCodiceID() {
        System.out.println("Restituisco il codice ID dell'elemento: " + codiceID);
        return codiceID;
    }
}
