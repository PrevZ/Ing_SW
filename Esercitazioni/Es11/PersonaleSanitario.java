package Es11;

// class PersonaleSanitario
public class PersonaleSanitario extends Persona implements Dipendente {
    private String matricola;
    private String specializzazione;
    private int anniServizio;

    public PersonaleSanitario(String nome, String cognome, String codiceFiscale, String matricola,
            String specializzazione, int anniServizio) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.specializzazione = specializzazione;
        this.anniServizio = anniServizio;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public int getAnniServizio() {
        return anniServizio;
    }

    @Override
    public double calcolaStipendio() {
        double stipendioBase = 2000; // Stipendio base
        double stipendioAnniServizio = anniServizio * 100; // Aumento per anni di servizio
        return stipendioBase + stipendioAnniServizio;
    }

    @Override
    public void registraOreLavoro(int ore) {
        System.out.println("Registro " + ore + " ore di lavoro per " + getNome() + " " + getCognome());
    }
}
