import java.util.ArrayList;
import java.time.LocalDate;

// Classe base Prodotto
public abstract class Prodotto {
    protected String codice;
    protected String nome;
    protected double prezzo;
    
    public Prodotto(String codice, String nome, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    public String getCodice() {
        return codice;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    
    // Metodo astratto per la descrizione specifica
    public abstract String getInfoSpecifiche();
    
    @Override
    public String toString() {
        return "Prodotto: " + nome + " (Cod: " + codice + ", Prezzo: €" + prezzo + ")";
    }
}
