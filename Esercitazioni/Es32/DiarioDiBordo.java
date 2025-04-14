import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class DiarioDiBordo {
    public static void main(String[] args) {
        ArrayList<VoceDiario> diario = new ArrayList<>();
        LocalDate oggi = LocalDate.now();
        
        // Aggiungo alcune voci al diario con date diverse
        diario.add(new VoceDiario("Iniziato nuovo progetto", oggi));
        diario.add(new VoceDiario("Incontro con il team di sviluppo", oggi.minusDays(1)));
        diario.add(new VoceDiario("Risolto bug critico", oggi.minusDays(3)));
        diario.add(new VoceDiario("Consegna prima versione", oggi.minusDays(5)));
        diario.add(new VoceDiario("Definizione requisiti", oggi.minusDays(8)));
        diario.add(new VoceDiario("Kickoff meeting", oggi.minusDays(10)));
        diario.add(new VoceDiario("Analisi preliminare", oggi.minusDays(15)));
        
        // Stampo tutte le voci del diario
        System.out.println("Tutte le voci del diario:");
        for (VoceDiario voce : diario) {
            System.out.println(voce);
        }
        
        // Stampo solo le voci degli ultimi 7 giorni
        System.out.println("\nVoci degli ultimi 7 giorni:");
        for (VoceDiario voce : diario) {
            long giorniDifferenza = ChronoUnit.DAYS.between(voce.getData(), oggi);
            if (giorniDifferenza <= 7) {
                System.out.println(voce);
            }
        }
    }
}
