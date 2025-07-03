// Classe generica Contatore
public class Contatore<T> {
    private T[] elementi;
    
    public Contatore(T[] elementi) {
        this.elementi = elementi;
    }
    
    public int conta() {
        return elementi.length;
    }
}
