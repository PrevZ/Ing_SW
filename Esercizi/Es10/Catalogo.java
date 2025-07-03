package Es10;

import java.util.ArrayList;
import java.util.List;

// Classe Catalogo
public class Catalogo {
    private String nome;
    private String descrizione;
    private List<ElementoMultimediale> elementi;
    private List<Categoria> categorie;

    public Catalogo(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.elementi = new ArrayList<>();
        this.categorie = new ArrayList<>();
    }

    public void creaCategoria(String nome, String descrizione) {
        System.out.println("Creazione categoria: " + nome);
        categorie.add(new Categoria(nome, descrizione));
    }

    public void aggiungiElemento(ElementoMultimediale elemento) {
        System.out.println("Aggiunta elemento multimediale: " + elemento.getTitolo());
        elementi.add(elemento);
    }

    public void assegnaElementoACategoria(ElementoMultimediale elemento, Categoria categoria) {
        System.out.println("Assegnazione elemento " + elemento.getTitolo() + " alla categoria " + categoria.getNome());
        categoria.getElementi().add(elemento);
    }

    public String getNome() {
        System.out.println("Restituisco il nome del catalogo: " + nome);
        return nome;
    }

    public String getDescrizione() {
        System.out.println("Restituisco la descrizione del catalogo: " + descrizione);
        return descrizione;
    }

    public List<ElementoMultimediale> getElementi() {
        System.out.println("Restituisco gli elementi multimediali del catalogo: " + nome);
        return elementi;
    }

    public List<Categoria> getCategorie() {
        System.out.println("Restituisco le categorie del catalogo: " + nome);
        return categorie;
    }

    public void cercaPerTitolo(String titolo) {
        System.out.println("Cerco elemento per titolo: " + titolo);
        List<ElementoMultimediale> risultati = new ArrayList<>();
        for (ElementoMultimediale elemento : elementi) {
            if (elemento.getTitolo().contains(titolo)) {
                risultati.add(elemento);
            }
        }
        for (ElementoMultimediale elemento : risultati) {
            System.out.println("- " + elemento.getTitolo());
        }
    }
}
