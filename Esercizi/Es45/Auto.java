public class Auto {
    private String targa;
    private String modello;
    private String colore;
    
    public Auto(String targa, String modello, String colore) {
        this.targa = targa;
        this.modello = modello;
        this.colore = colore;
    }
    
    public String getTarga() {
        return targa;
    }
    
    public String getModello() {
        return modello;
    }
    
    public String getColore() {
        return colore;
    }
    
    @Override
    public String toString() {
        return targa + " (" + modello + " " + colore + ")";
    }
}