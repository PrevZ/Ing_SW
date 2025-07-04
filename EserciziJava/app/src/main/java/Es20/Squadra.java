import java.util.Comparator;

public class Squadra {
    private String nome;
    private int punti;
    
    public Squadra(String nome, int punti) {
        this.nome = nome;
        this.punti = punti;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getPunti() {
        return punti;
    }
    
    @Override
    public String toString() {
        return nome + " - " + punti + " punti";
    }
}
