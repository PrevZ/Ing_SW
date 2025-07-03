package Es10;

import java.util.ArrayList;
import java.util.List;

// Classe Categoria 
public class Categoria {
    private String nome;
    private String descrizione;
    private List<ElementoMultimediale> elementi;

    public Categoria(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.elementi = new ArrayList<>();
    }

    public String getNome() {
        System.out.println("Restituisco il nome della categoria: " + nome);
        return nome;
    }

    public String getDescrizione() {
        System.out.println("Restituisco la descrizione della categoria: " + descrizione);
        return descrizione;
    }

    public List<ElementoMultimediale> getElementi() {
        System.out.println("Restituisco gli elementi multimediali della categoria: " + nome);
        return elementi;
    }
}
