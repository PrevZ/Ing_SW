
public class Gatto extends AnimaleBase{
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public void emettiVerso() {
        System.out.println("Miao Miao");
    }

    @Override
    public void muoviti() {
        System.out.println("Il gatto cammina");
    }
}
