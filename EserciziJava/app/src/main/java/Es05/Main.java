
public class Main {
    public static void main(String[] args) {
        SistemaPrenotazioni sistema = new SistemaPrenotazioni();

        Viaggio viaggioAereo = new ViaggioAereo("Tokyo", 1300.50, "ITA Airways");
        Viaggio viaggioTreno = new ViaggioTreno("Milano", 60.00, 23);

        sistema.aggiungiViaggio(viaggioAereo);
        sistema.aggiungiViaggio(viaggioTreno);

        sistema.visualizzaViaggi();

        sistema.prenotaViaggio(viaggioAereo);
        sistema.prenotaViaggio(viaggioAereo); // Questo dovrebbe lanciare un'eccezione

        sistema.visualizzaViaggi();
    }
}
