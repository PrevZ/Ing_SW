package Es12;

public class Sviluppatore extends Dipendente{
    private Number matricola;

    public Sviluppatore(String nome, Number matricola) {
        super(nome);
        this.matricola = matricola;
    }

    public void lavora() {
        System.out.println("Lo sviluppatore " + getNome() + " sta lavorando.");
    }

    public double calcolaPaga() {
        return 3000.0; // Esempio di calcolo della paga
    }
}
