
public class Manager extends Dipendente {
    private int bonus;

    public Manager(String nome, int stipendio, int bonus) {
        super(nome, stipendio);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int calcolaStipendio() {
        return getStipendio() + bonus;
    }
}
