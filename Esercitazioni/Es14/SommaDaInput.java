public class SommaDaInput {
    public static void main(String[] args) {
        int somma = 0;
        
        // Controllo se sono stati forniti argomenti
        if (args.length == 0) {
            System.out.println("Nessun numero fornito!");
            return;
        }
        
        // Sommo tutti i numeri
        for (String arg : args) {
            try {
                int numero = Integer.parseInt(arg);
                somma += numero;
            } catch (NumberFormatException e) {
                System.out.println("Errore: '" + arg + "' non è un numero valido.");
            }
        }
        
        System.out.println("La somma è: " + somma);
    }
}
