import java.util.ArrayList;
import java.util.Arrays;

// Classe Studente
public class Studente {
    private String nome;
    private String matricola;
    private int[] voti;
    
    public Studente(String nome, String matricola, int[] voti) {
        this.nome = nome;
        this.matricola = matricola;
        this.voti = voti;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricola() {
        return matricola;
    }
    
    public int[] getVoti() {
        return voti;
    }
    
    public double calcolaMedia() {
        if (voti.length == 0) return 0;
        
        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        return (double) somma / voti.length;
    }
}
