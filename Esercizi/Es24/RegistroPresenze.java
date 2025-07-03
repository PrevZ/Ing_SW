public class RegistroPresenze {
    public static void main(String[] args) {
        // Definizione di studenti e giorni della settimana
        String[] studenti = {"Mario", "Luca", "Giulia", "Anna", "Paolo"};
        String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì"};
        
        // Array bidimensionale per le presenze (1 = presente, 0 = assente)
        // [studente][giorno]
        int[][] presenze = {
            {1, 1, 0, 1, 1},  // Mario
            {1, 1, 1, 0, 0},  // Luca
            {1, 1, 1, 1, 1},  // Giulia
            {0, 0, 1, 1, 1},  // Anna
            {1, 0, 1, 0, 1}   // Paolo
        };
        
        // Stampo la tabella delle presenze
        System.out.println("Tabella delle presenze:");
        System.out.print("Studente\t");
        
        for (String giorno : giorni) {
            System.out.print(giorno + "\t");
        }
        System.out.println("Totale");
        
        // Stampo le presenze per ogni studente
        for (int i = 0; i < studenti.length; i++) {
            System.out.print(studenti[i] + "\t\t");
            
            int totalePresenze = 0;
            for (int j = 0; j < giorni.length; j++) {
                System.out.print(presenze[i][j] + "\t");
                totalePresenze += presenze[i][j];
            }
            
            System.out.println(totalePresenze);
        }
    }
}
