
public class Impiegato extends Dipendente {
    public Impiegato(String nome, int stipendio) {
        super(nome, stipendio);
    }

    @Override
    public int calcolaStipendio() {
        return getStipendio();
    }
}
