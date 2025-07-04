import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;
    private String nomeFile;
    private DateTimeFormatter formatter;
    
    private Logger() {
        this.nomeFile = "application.log";
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Metodo per scrivere un log generico
    public void log(String livello, String messaggio) {
        try {
            FileWriter writer = new FileWriter(nomeFile, true); // Append mode
            
            String timestamp = LocalDateTime.now().format(formatter);
            String logEntry = String.format("[%s] %s: %s%n", timestamp, livello, messaggio);
            
            writer.write(logEntry);
            writer.close();
            
            // Stampo anche sulla console
            System.out.print(logEntry);
            
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del log: " + e.getMessage());
        }
    }
    
    // Metodi di convenienza per diversi livelli di log
    public void info(String messaggio) {
        log("INFO", messaggio);
    }
    
    public void warning(String messaggio) {
        log("WARNING", messaggio);
    }
    
    public void error(String messaggio) {
        log("ERROR", messaggio);
    }
    
    public void debug(String messaggio) {
        log("DEBUG", messaggio);
    }
    
    // Metodo per cambiare il file di log 
    public void setNomeFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }
}