
public abstract class Viaggio implements Prenotabile{
    private String destinazione;
    private double prezzo;
    private boolean prenotato;

    public Viaggio(String destinazione, double prezzo) {
        this.destinazione = destinazione;
        this.prezzo = prezzo;
        this.prenotato = false;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public boolean isPrenotato() {
        return prenotato;
    }

    @Override
    public void prenota() throws ViaggioGiaPrenotatoException {
        if (prenotato) {
            throw new ViaggioGiaPrenotatoException("Il viaggio è già prenotato");
        }
        prenotato = true;
    }

    public abstract String descrizione();
}
