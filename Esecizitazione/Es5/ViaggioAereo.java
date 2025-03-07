package Es5;

public class ViaggioAereo extends Viaggio {
    private String compagniaAerea;

    public ViaggioAereo(String destinazione, double prezzo, String compagniaAerea) {
        super(destinazione, prezzo);
        this.compagniaAerea = compagniaAerea;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    @Override
    public String descrizione() {
        return "Viaggio aereo per " + getDestinazione() + " con " + compagniaAerea + " al prezzo di " + getPrezzo();
    }
}
