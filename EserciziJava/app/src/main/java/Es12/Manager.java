package Es12;

public class Manager extends Dipendente{
    private Number mobile;

    public Manager(String nome, Number mobile) {
        super(nome);
        this.mobile = mobile;
    }

    public void lavora() {
        System.out.println("Il manager " + getNome() + " sta lavorando.");
    }

    public double calcolaPaga() {
        return 5000.0; // Esempio di calcolo della paga
    }
}
