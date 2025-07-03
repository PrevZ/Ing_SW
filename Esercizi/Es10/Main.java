package Es10;

// Classe Main per dimostrare l'utilizzo
public class Main {
    public static void main(String[] args) {
        // Creazione del catalogo
        Catalogo bibliotecaDigitale = new Catalogo("Biblioteca Digitale", "Catalogo multimediale della biblioteca");
        
        // Creazione delle categorie
        bibliotecaDigitale.creaCategoria("Fantascienza", "Film e libri di fantascienza");
        bibliotecaDigitale.creaCategoria("Classici", "Opere classiche della letteratura e della musica");
        
        // Creazione di elementi multimediali
        Libro libro = new Libro("1984", 1949, "LBR001", "George Orwell", 328, "Mondadori");
        Film film = new Film("Blade Runner", 1982, "FLM001", 117, "Ridley Scott", 
                            new String[]{"Harrison Ford", "Rutger Hauer"}, "Fantascienza");
        Musica musica = new Musica("Bohemian Rhapsody", 1975, "MUS001", 6, "Queen", "A Night at the Opera", "Rock");
        
        // Aggiunta degli elementi al catalogo
        bibliotecaDigitale.aggiungiElemento(libro);
        bibliotecaDigitale.aggiungiElemento(film);
        bibliotecaDigitale.aggiungiElemento(musica);
        
        // Assegnazione degli elementi alle categorie
        Categoria fantascienza = new Categoria("Fantascienza", "Film e libri di fantascienza");
        bibliotecaDigitale.assegnaElementoACategoria(film, fantascienza);
        bibliotecaDigitale.assegnaElementoACategoria(libro, fantascienza);
        
        // Dimostrazione dei metodi
        libro.getAutore();
        film.riproduci();
        film.getDurata();
        musica.getArtista();
        musica.riproduci();
        
        // Ricerca nel catalogo
        bibliotecaDigitale.cercaPerTitolo("Blade");
    }
}
