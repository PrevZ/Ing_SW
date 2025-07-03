import java.util.Scanner;

public class GestioneParcheggio {
    public static void main(String[] args) {
        // Creo un parcheggio con 10 posti
        Parcheggio parcheggio = new Parcheggio("Centro Commerciale", 10);
        
        // Simulo alcune auto
        Auto[] auto = {
            new Auto("AB123CD", "Fiat Panda", "Bianca"),
            new Auto("EF456GH", "Volkswagen Golf", "Blu"),
            new Auto("IJ789KL", "Toyota Yaris", "Rossa"),
            new Auto("MN012OP", "BMW Serie 3", "Nera"),
            new Auto("QR345ST", "Mercedes Classe A", "Grigia")
        };
        
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        
        do {
            System.out.println("\n=== GESTIONE PARCHEGGIO ===");
            System.out.println("1. Mostra stato parcheggio");
            System.out.println("2. Parcheggia auto");
            System.out.println("3. Rimuovi auto");
            System.out.println("4. Cerca auto per targa");
            System.out.println("5. Simula traffico automatico");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            
            scelta = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (scelta) {
                case 1:
                    parcheggio.stampaStatoParcheggio();
                    break;
                    
                case 2:
                    System.out.print("Inserisci targa: ");
                    String targa = scanner.nextLine();
                    System.out.print("Inserisci modello: ");
                    String modello = scanner.nextLine();
                    System.out.print("Inserisci colore: ");
                    String colore = scanner.nextLine();
                    
                    Auto nuovaAuto = new Auto(targa, modello, colore);
                    parcheggio.parcheggiaAuto(nuovaAuto);
                    break;
                    
                case 3:
                    System.out.print("Inserisci targa dell'auto da rimuovere: ");
                    String targaDaRimuovere = scanner.nextLine();
                    parcheggio.rimuoviAuto(targaDaRimuovere);
                    break;
                    
                case 4:
                    System.out.print("Inserisci targa da cercare: ");
                    String targaDaCercare = scanner.nextLine();
                    Auto autoTrovata = parcheggio.cercaAuto(targaDaCercare);
                    
                    if (autoTrovata != null) {
                        System.out.println("Auto trovata: " + autoTrovata);
                    } else {
                        System.out.println("Auto non presente nel parcheggio");
                    }
                    break;
                    
                case 5:
                    System.out.println("Simulazione traffico automatico...");
                    
                    // Parcheggio alcune auto di esempio
                    for (Auto a : auto) {
                        parcheggio.parcheggiaAuto(a);
                        if (parcheggio.getPostiLiberi() == 0) break;
                    }
                    
                    parcheggio.stampaStatoParcheggio();
                    
                    // Rimuovo alcune auto
                    System.out.println("\nRimozione di alcune auto...");
                    parcheggio.rimuoviAuto("AB123CD");
                    parcheggio.rimuoviAuto("IJ789KL");
                    
                    parcheggio.stampaStatoParcheggio();
                    break;
            }
        } while (scelta != 0);
        
        scanner.close();
        System.out.println("Arrivederci!");
    }
}