package Es9;

// Classe Professore che estende Persona
public class Professore extends Persona{
    private String ufficio;
    private Dipartimento dipartimento;

    public Professore(String nome, String cognome, String codiceFiscale, String ufficio, Dipartimento dipartimento) {
        super(nome, cognome, codiceFiscale);
        this.ufficio = ufficio;
        this.dipartimento = dipartimento;
    }

    public String getUfficio() {
        System.out.println("Restituisco l'ufficio: " + ufficio);
        return ufficio;
    }

    public Dipartimento getDipartimento() {
        System.out.println("Restituisco il dipartimento: " + dipartimento.getNome());
        return dipartimento;
    }
}
