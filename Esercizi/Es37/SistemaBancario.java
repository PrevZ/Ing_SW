// Classe principale
import java.util.ArrayList;

public class SistemaBancario {
    public static void main(String[] args) {
        ArrayList<ContoBancario> conti = new ArrayList<>();
        
        // Aggiungo conti di diverso tipo
        conti.add(new ContoCorrente("CC001", "Mario Rossi", 1500.0, 0.5, 1000.0));
        conti.add(new ContoRisparmio("CR001", "Lucia Bianchi", 5000.0, 2.5));
        conti.add(new ContoCorrente("CC002", "Giovanni Verdi", 2500.0, 0.5, 500.0));
        conti.add(new ContoRisparmio("CR002", "Anna Neri", 10000.0, 2.0));
        
        System.out.println("DETTAGLIO CONTI:");
        for (ContoBancario conto : conti) {
            System.out.println(conto);
        }
        
        System.out.println("\nCALCOLO INTERESSI:");
        for (ContoBancario conto : conti) {
            double interesse = conto.calcolaInteresse();
            System.out.println("Interesse per " + conto + ":");
            System.out.println("€" + String.format("%.2f", interesse));
            conto.deposita(interesse); // Accredito l'interesse
            System.out.println();
        }
        
        // Esempio di operazioni
        System.out.println("ESEMPIO OPERAZIONI:");
        ContoCorrente cc = (ContoCorrente)conti.get(0);
        cc.preleva(2000); // Utilizzo dello scoperto
        
        ContoRisparmio cr = (ContoRisparmio)conti.get(1);
        cr.preleva(6000); // Tentativo prelievo oltre disponibilità
    }
}
