// Classe Prodotto
public class Prodotto {
    private String nome;
    private String categoria;
    private double prezzo;
    private boolean disponibile;
    
    public Prodotto(String nome, String categoria, double prezzo, boolean disponibile) {
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
        this.disponibile = disponibile;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public double getPrezzo() {
        return prezzo;
    }
    
    public boolean isDisponibile() {
        return disponibile;
    }
    
    @Override
    public String toString() {
        return nome + " (" + categoria + ") - €" + prezzo + 
               (disponibile ? " - Disponibile" : " - Non disponibile");
    }
}
