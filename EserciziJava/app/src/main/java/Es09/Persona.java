package Es9;

// Classe astratta Persona
public abstract class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        System.out.println("Restituisco il nome: " + nome);
        return nome;
    }

    public String getCognome() {
        System.out.println("Restituisco il cognome: " + cognome);
        return cognome;
    }

    public String getCodiceFiscale() {
        System.out.println("Restituisco il codice fiscale: " + codiceFiscale);
        return codiceFiscale;
    }
}
