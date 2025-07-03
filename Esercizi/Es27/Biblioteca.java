import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        // Creo una lista di libri
        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        // Aggiungo alcuni libri
        biblioteca.add(new Libro("Il nome della rosa", "Umberto Eco", 1980));
        biblioteca.add(new Libro("1984", "George Orwell", 1949));
        biblioteca.add(new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954));
        biblioteca.add(new Libro("Harry Potter e la pietra filosofale", "J.K. Rowling", 1997));
        
        // Stampo la lista dei libri
        System.out.println("Libri in biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}
