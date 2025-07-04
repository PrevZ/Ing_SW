package Es12;

public abstract class Dipendente implements Lavoratore, Pagabile{
    private String nome;

    public Dipendente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
