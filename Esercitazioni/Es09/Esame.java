package Es9;

// Classe astratta Esame
public abstract class Esame {
    private String data;
    private int votoFinale;

    public Esame(String data, int votoFinale) {
        this.data = data;
        this.votoFinale = votoFinale;
    }

    public String getData() {
        System.out.println("Restituisco la data: " + data);
        return data;
    }

    public int getVotoFinale() {
        System.out.println("Restituisco il voto finale: " + votoFinale);
        return votoFinale;
    }
}
