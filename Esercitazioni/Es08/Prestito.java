package Es8;
import java.util.Date;

public class Prestito {
    // Attributi della classe
    private Date dataInizio;
    private Date dataFine;
    private Utente utente;
    private Libro libro;

    // Costruttore
    public Prestito(Date dataInizio, Date dataFine, Utente utente, Libro libro) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.utente = utente;
        this.libro = libro;
    }

    // Metodi getter e setter
    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
