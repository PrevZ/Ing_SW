
public class Cane extends AnimaleBase{
    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println("Woof Woof");
    }

    @Override
    public void muoviti() {
        System.out.println("Il cane corre");
    }
}
