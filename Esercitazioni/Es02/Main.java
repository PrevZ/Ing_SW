public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Harry Potter e la pietra filosofale", 1997, "J.K. Rowling");
        Rivista rivista = new Rivista("Focus", 2021, 5);

        // Aggiungi materiali alla biblioteca
        biblioteca.aggiungiMateriale(libro);
        biblioteca.aggiungiMateriale(rivista);

        // Visualizza i materiali 
        biblioteca.visualizzaMateriali();

        // Rimuovi un materiale
        biblioteca.rimuoviMateriale(libro);

        // Visualizza i materiali dopo la rimozione
        biblioteca.visualizzaMateriali();
    }
}
