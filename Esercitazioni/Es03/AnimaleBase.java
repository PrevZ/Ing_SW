
public abstract class AnimaleBase implements Animale{
    private String nome;

    public AnimaleBase(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public abstract void emettiVerso();

    @Override
    public abstract void muoviti();
}
