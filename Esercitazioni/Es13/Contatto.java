// Classe Contatto con incapsulamento
public class Contatto {
    private String nome;
    private String numeroTelefono;
    
    public Contatto(String nome, String numeroTelefono) {
        this.nome = nome;
        this.numeroTelefono = numeroTelefono;
    }
    
    // Getter e Setter
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefono: " + numeroTelefono;
    }
}
