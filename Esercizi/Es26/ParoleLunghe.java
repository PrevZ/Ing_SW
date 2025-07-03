public class ParoleLunghe {
    public static void main(String[] args) {
        // Controllo se ci sono argomenti
        if (args.length == 0) {
            System.out.println("Nessuna parola fornita!");
            return;
        }
        
        System.out.println("Parole più lunghe di 5 lettere:");
        
        // Scorro tutte le parole e stampo solo quelle che soddisfano la condizione
        for (String parola : args) {
            if (parola.length() > 5) {
                System.out.println(parola);
            }
        }
    }
}
