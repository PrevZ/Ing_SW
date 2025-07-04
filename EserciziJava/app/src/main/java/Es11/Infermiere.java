package Es11;

// Classe Infermiere
public class Infermiere extends PersonaleSanitario {
    private String reparto;

    public Infermiere(String nome, String cognome, String codiceFiscale,
            String matricola, String specializzazione, int anniServizio, String reparto) {
        super(nome, cognome, codiceFiscale, matricola, specializzazione, anniServizio);
        this.reparto = reparto;
    }

    public String getReparto() {
        return reparto;
    }

    public void svolgeTurno() {
        System.out.println("L'infermiere " + getNome() + " " + getCognome() + " sta svolgendo il turno nel reparto " + reparto);
    }

    @Override
    public double calcolaStipendio() {
        System.out.println("Calcolo stipendio per l'infermiere " + getNome() + " " + getCognome() + " in base agli anni di servizio");
        return 1500 + (getAnniServizio() * 50);
    }
}
