// Classe Paziente
public class Paziente {
    private String id;
    private String nome;
    private String cognome;
    private String dataNascita;
    
    public Paziente(String id, String nome, String cognome, String dataNascita) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return cognome + " " + nome + " (ID: " + id + ", nato il " + dataNascita + ")";
    }
}
