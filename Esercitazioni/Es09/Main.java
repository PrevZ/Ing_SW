package Es9;

public class Main {
    public static void main(String[] args) {
        // Creo un dipartimento
        Dipartimento dipartimento = new Dipartimento("Informatica", "Via dell'Università 10", 5);

        // Creo un corso
        Corso corso = new Corso("INF101", "Programmazione", 9, dipartimento);

        // Creo un profOrdinario
        ProfOrdinario professore = new ProfOrdinario("Mario", "Rossi", "RSSMRA70A01H501X", "B210", dipartimento, 2010);

        // Creo uno studente
        Studente studente = new Studente("Luca", "Bianchi", "BNCLCU00A01H501Y", "123456", 2023);

        // Creo un esame
        EsameOrale esame = new EsameOrale("2025-06-15", 30, 15);

        // Dimostro alcune funzionalità
        dipartimento.getNome();
        corso.getNome();
        corso.getCrediti();
        professore.getNome();
        professore.getUfficio();
        professore.getAnnoRuolo();
        studente.getNome();
        studente.getMatricola();
        esame.calcolaVoto();
        esame.getVotoFinale();
    }
}
