// Classe Prenotazione
public class Prenotazione {
    private static int contatore = 0;
    private int codice;
    private Film film;
    private Sala sala;
    private int numPosti;
    private String nominativo;
    
    public Prenotazione(Film film, Sala sala, int numPosti, String nominativo) {
        this.codice = ++contatore;
        this.film = film;
        this.sala = sala;
        this.numPosti = numPosti;
        this.nominativo = nominativo;
    }
    
    @Override
    public String toString() {
        return "Prenotazione #" + codice + " - " + film.getTitolo() + 
               " - " + sala.getNumero() + " - Posti: " + numPosti + 
               " - Cliente: " + nominativo;
    }
}
