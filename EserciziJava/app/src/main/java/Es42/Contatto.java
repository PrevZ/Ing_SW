public class Contatto {
    private String nome;
    private String numero;
    private String email;
    
    public Contatto(String nome, String numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDominioEmail() {
        if (email != null && email.contains("@")) {
            return email.substring(email.indexOf("@") + 1);
        }
        return "";
    }
    
    @Override
    public String toString() {
        return nome + " - " + numero + " - " + email;
    }
}