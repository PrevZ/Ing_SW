package Es11;

// class Medico
public class Medico extends PersonaleSanitario {
    private int livello;

    public Medico(String nome, String cognome, String codiceFiscale,
            String matricola, String specializzazione, int anniServizio, int livello) {
        super(nome, cognome, codiceFiscale, matricola, specializzazione, anniServizio);
        this.livello = livello;
    }

    public int getLivello() {
        return livello;
    }

    public void prescriviFarmaco(String farmaco, Paziente paziente) {
        System.out.println("Il Dr. " + getCognome() + " prescrive " + farmaco + " al paziente " + paziente.getCognome());
    }
    
    @Override
    public double calcolaStipendio() {
        System.out.println("Calcolo stipendio per il medico " + getNome() + " " + getCognome() + " in base al livello " + livello);
        return 2000 + (livello * 500);
    }
}
