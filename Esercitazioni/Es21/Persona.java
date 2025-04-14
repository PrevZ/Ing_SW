public class Persona {
    private String nome;
    private int eta;
    
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getEta() {
        return eta;
    }
    
    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        }
    }
    
    @Override
    public String toString() {
        return "Persona: " + nome + ", età: " + eta;
    }
}
