public class Scacchiera {
    public static void main(String[] args) {
        // Creo una scacchiera 8x8
        String[][] scacchiera = new String[8][8];
        
        // Popolo la prima riga con i pezzi
        scacchiera[0][0] = "Torre";
        scacchiera[0][1] = "Cavallo";
        scacchiera[0][2] = "Alfiere";
        scacchiera[0][3] = "Regina";
        scacchiera[0][4] = "Re";
        scacchiera[0][5] = "Alfiere";
        scacchiera[0][6] = "Cavallo";
        scacchiera[0][7] = "Torre";
        
        // Popolo la seconda riga con i pedoni
        for (int i = 0; i < 8; i++) {
            scacchiera[1][i] = "Pedone";
        }
        
        // Popolo l'ultima riga con i pezzi
        scacchiera[7][0] = "Torre";
        scacchiera[7][1] = "Cavallo";
        scacchiera[7][2] = "Alfiere";
        scacchiera[7][3] = "Regina";
        scacchiera[7][4] = "Re";
        scacchiera[7][5] = "Alfiere";
        scacchiera[7][6] = "Cavallo";
        scacchiera[7][7] = "Torre";
        
        // Popolo la penultima riga con i pedoni
        for (int i = 0; i < 8; i++) {
            scacchiera[6][i] = "Pedone";
        }
        
        // Stampo la scacchiera
        System.out.println("Scacchiera:");
        for (int riga = 0; riga < 8; riga++) {
            System.out.print((8 - riga) + " "); // Numeri delle righe
            
            for (int colonna = 0; colonna < 8; colonna++) {
                String pezzo = scacchiera[riga][colonna];
                // Se la cella è vuota, stampo uno spazio, altrimenti il pezzo
                if (pezzo == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[" + pezzo.substring(0, 1) + "] ");
                }
            }
            System.out.println();
        }
        
        // Stampo le lettere delle colonne
        System.out.print("  ");
        for (char c = 'a'; c <= 'h'; c++) {
            System.out.print(" " + c + "  ");
        }
        System.out.println();
    }
}
