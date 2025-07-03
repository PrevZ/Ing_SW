
public abstract class Dipendente {
    private String nome;
    private int stipendio;

    public Dipendente(String nome, int stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public int getStipendio() {
        return stipendio;
    }

    public abstract int calcolaStipendio();
}
