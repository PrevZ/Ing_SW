public class Persona {
    private String nome;
    private int eta;
    private String email;
    
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public Persona(String nome, int eta, String email) {
        this.nome = nome;
        this.eta = eta;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getEta() {
        return eta;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                (email != null ? ", email='" + email + '\'' : "") +
                '}';
    }
}
