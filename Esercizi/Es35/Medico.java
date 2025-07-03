// Classe Medico
public class Medico {
    private String id;
    private String nome;
    private String cognome;
    private String specializzazione;
    
    public Medico(String id, String nome, String cognome, String specializzazione) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
    }
    
    @Override
    public String toString() {
        return "Dr. " + cognome + " " + nome + " - " + specializzazione;
    }
}
