import java.util.Arrays;

public class OrdinaParole {
    public static void main(String[] args) {
        // Controllo se ci sono argomenti
        if (args.length == 0) {
            System.out.println("Nessuna parola fornita!");
            System.out.println("Utilizzo: java OrdinaParole parola1 parola2 parola3 ...");
            return;
        }
        
        // Stampo le parole originali
        System.out.println("Parole originali:");
        for (String parola : args) {
            System.out.println(parola);
        }
        
        // Ordino le parole
        Arrays.sort(args);
        
        // Stampo le parole ordinate
        System.out.println("\nParole ordinate alfabeticamente:");
        for (String parola : args) {
            System.out.println(parola);
        }
    }
}
