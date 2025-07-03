package Es8;
import java.util.ArrayList;
import java.util.List;

public class Utente {
    // Attributi della classe
    private String nome;
    private String idUtente;
    private List<Libro> libriInPrestito;

    // Costruttore
    public Utente(String nome, String idUtente){
        this.nome = nome;
        this.idUtente = idUtente;
        this.libriInPrestito = new ArrayList<>(); // Inizializza la lista dei libri in prestito
    }

    // Metodi getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public List<Libro> getLibriInPrestito() {
        return libriInPrestito;
    }

    public void setLibriInPrestito(List<Libro> libriInPrestito) {
        this.libriInPrestito = libriInPrestito;
    }
}
