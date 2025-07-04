import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> elementi;
    
    public Stack() {
        this.elementi = new ArrayList<>();
    }
    
    // Aggiunge un elemento in cima allo stack
    public void push(T elemento) {
        elementi.add(elemento);
    }
    
    // Rimuove e restituisce l'elemento in cima allo stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementi.remove(elementi.size() - 1);
    }
    
    // Restituisce l'elemento in cima senza rimuoverlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementi.get(elementi.size() - 1);
    }
    
    // Verifica se lo stack è vuoto
    public boolean isEmpty() {
        return elementi.isEmpty();
    }
    
    // Dimensione dello stack
    public int size() {
        return elementi.size();
    }
}
