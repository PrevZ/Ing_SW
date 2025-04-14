package Es10;

// Classe Musica che estende Media
public class Musica extends Media {
    private String artista;
    private String album;
    private String genere;

    public Musica(String titolo, int annoPubbl, String codiceID, int durata, String artista, String album, String genere) {
        super(titolo, annoPubbl, codiceID, durata);
        this.artista = artista;
        this.album = album;
        this.genere = genere;
    }

    @Override
    public void riproduci() {
        System.out.println("Riproduzione della musica: " + getTitolo() + " di " + artista + " dall'album " + album + " del genere " + genere);
    }

    public String getArtista() {
        System.out.println("Restituisco l'artista del brano: " + artista);
        return artista;
    }
    
    public String getAlbum() {
        System.out.println("Restituisco l'album del brano: " + album);
        return album;
    }
    
    public String getGenere() {
        System.out.println("Restituisco il genere musicale del brano: " + genere);
        return genere;
    }
}
