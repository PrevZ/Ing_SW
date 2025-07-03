import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestioneFileStudenti {
    public static void main(String[] args) {
        // Percorso dei file
        String fileInput = "studenti.txt";
        String fileOutput = "risultati.txt";
        
        ArrayList<Studente> studenti = new ArrayList<>();
        
        try {
            // Leggo il file di input
            File file = new File(fileInput);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] parti = linea.split(",");
                
                if (parti.length == 2) {
                    String nome = parti[0].trim();
                    int voto;
                    
                    try {
                        voto = Integer.parseInt(parti[1].trim());
                        studenti.add(new Studente(nome, voto));
                    } catch (NumberFormatException e) {
                        System.out.println("Errore di parsing per il voto di " + nome);
                    }
                }
            }
            
            scanner.close();
            
            // Calcolo la media dei voti
            double somma = 0;
            for (Studente s : studenti) {
                somma += s.getVoto();
            }
            
            double media = studenti.isEmpty() ? 0 : somma / studenti.size();
            
            // Scrivo i risultati nel file di output
            FileWriter writer = new FileWriter(fileOutput);
            writer.write("Elenco studenti:\n");
            
            for (Studente s : studenti) {
                writer.write(s.toString() + "\n");
            }
            
            writer.write("\nNumero studenti: " + studenti.size() + "\n");
            writer.write("Media voti: " + String.format("%.2f", media));
            
            writer.close();
            
            System.out.println("Elaborazione completata. Risultati salvati in " + fileOutput);
            
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + fileInput);
        } catch (IOException e) {
            System.out.println("Errore di I/O: " + e.getMessage());
        }
    }
}
