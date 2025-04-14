import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MagazzinoMulticlasse {
    public static void main(String[] args) {
        ArrayList<Prodotto> magazzino = new ArrayList<>();
        
        // Aggiungo prodotti alimentari
        magazzino.add(new Alimentare("A001", "Pasta", 1.5, LocalDate.of(2023, 12, 15), false));
        magazzino.add(new Alimentare("A002", "Yogurt Bio", 3.2, LocalDate.of(2023, 5, 10), true));
        magazzino.add(new Alimentare("A003", "Insalata", 2.0, LocalDate.of(2023, 4, 25), true));
        
        // Aggiungo prodotti elettronici
        magazzino.add(new Elettronico("E001", "Smartphone", 499.99, 24, "Samsung"));
        magazzino.add(new Elettronico("E002", "Laptop", 899.99, 24, "Dell"));
        magazzino.add(new Elettronico("E003", "Cuffie", 79.99, 12, "Sony"));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== GESTIONE MAGAZZINO ===");
        System.out.println("1. Mostra tutti i prodotti");
        System.out.println("2. Mostra solo prodotti alimentari");
        System.out.println("3. Mostra solo prodotti elettronici");
        
        System.out.print("Scegli un'opzione: ");
        int scelta = scanner.nextInt();
        
        switch (scelta) {
            case 1:
                System.out.println("\nTUTTI I PRODOTTI:");
                for (Prodotto p : magazzino) {
                    System.out.println(p);
                }
                break;
                
            case 2:
                System.out.println("\nPRODOTTI ALIMENTARI:");
                for (Prodotto p : magazzino) {
                    if (p instanceof Alimentare) {
                        System.out.println(p);
                    }
                }
                break;
                
            case 3:
                System.out.println("\nPRODOTTI ELETTRONICI:");
                for (Prodotto p : magazzino) {
                    if (p instanceof Elettronico) {
                        Elettronico e = (Elettronico) p;
                        System.out.println(p + " - Marca: " + e.getMarca());
                    }
                }
                break;
                
            default:
                System.out.println("Opzione non valida.");
        }
        
        scanner.close();
    }
}
