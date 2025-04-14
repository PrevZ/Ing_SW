// Classe figlia Elettronico
public class Elettronico extends Prodotto {
    private int garanziaMesi;
    private String marca;
    
    public Elettronico(String codice, String nome, double prezzo, int garanziaMesi, String marca) {
        super(codice, nome, prezzo);
        this.garanziaMesi = garanziaMesi;
        this.marca = marca;
    }
    
    public int getGaranziaMesi() {
        return garanziaMesi;
    }
    
    public String getMarca() {
        return marca;
    }
    
    @Override
    public String getInfoSpecifiche() {
        return "Marca: " + marca + ", Garanzia: " + garanziaMesi + " mesi";
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + getInfoSpecifiche();
    }
}
