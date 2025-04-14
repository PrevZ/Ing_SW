package Es8;
import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    // Attributi della classe
    private List<Libro> listaLibri;
    private List<Utente> listaUtenti;

    // Costruttore
    public SistemaBiblioteca() {
        this.listaLibri = new ArrayList<>(); // Inizializza la lista dei libri
        this.listaUtenti = new ArrayList<>(); // Inizializza la lista degli utenti
    }

    // Metodi per gestire i libri e gli utenti
    public void aggiungiLibro(Libro libro) {
        listaLibri.add(libro); // Aggiunge un libro alla lista
        System.out.println("Libro aggiunto: " + libro.getTitolo());
    }

    public void registraUtente(Utente utente) {
        listaUtenti.add(utente); // Aggiunge un utente alla lista
        System.out.println("Utente registrato: " + utente.getNome());
    }

    public void prestaLibro(Libro libro, Utente utente){
        if(libro.isDisponibilita()){
            libro.setDisponibilita(false); // Imposta la disponibilità del libro a false
            utente.getLibriInPrestito().add(libro); // Aggiunge il libro alla lista dei libri in prestito dell'utente
            System.out.println("Libro prestato: " + libro.getTitolo() + " a " + utente.getNome());
        } else {
            System.out.println("Il libro " + libro.getTitolo() + " non è disponibile.");
        }
    }

    public void restituisciLibro(Libro libro, Utente utente){
        libro.setDisponibilita(true); // Imposta la disponibilità del libro a true
        utente.getLibriInPrestito().remove(libro); // Rimuove il libro dalla lista dei libri in prestito dell'utente
        System.out.println("Libro restituito: " + libro.getTitolo() + " da " + utente.getNome());
    }

    public void visualizzaStato(){
        System.out.println("Stato attuale dei prestiti:");
        for (Utente utente : listaUtenti) {
            System.out.println("Utente: " + utente.getNome() + " (ID: " + utente.getIdUtente() + ")");
            for (Libro libro : utente.getLibriInPrestito()) {
                System.out.println(" - " + libro.getTitolo() + " (ISBN: " + libro.getIsbn() + ")");
            }
        }
    }
}
