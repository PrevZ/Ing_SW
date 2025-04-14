package Es8;

public class Main {
    public static void main(String[] args) {
        // Creazione del sistema biblioteca
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        // Aggiunta di libri
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", "978-0261102385");
        Libro libro2 = new Libro("1984", "George Orwell", "978-0451524935");

        sistema.aggiungiLibro(libro1);
        sistema.aggiungiLibro(libro2);

        // Registrazione di utenti
        Utente utente1 = new Utente("Mario Rossi", "U001");
        Utente utente2 = new Utente("Giulia Bianchi", "U002");

        sistema.registraUtente(utente1);
        sistema.registraUtente(utente2);

        // Prestito di un libro
        sistema.prestaLibro(libro1, utente1);

        // Visualizzazione dello stato attuale dei prestiti
        sistema.visualizzaStato();

        // Restituzione di un libro
        sistema.restituisciLibro(libro1, utente1);

        // Visualizzazione dello stato attuale dei prestiti dopo la restituzione
        sistema.visualizzaStato();
    }
}
