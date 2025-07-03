import java.util.HashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SistemaLogin {
    private HashMap<String, String> utenti;
    
    public SistemaLogin() {
        this.utenti = new HashMap<>();
        inizializzaUtenti();
    }
    
    private void inizializzaUtenti() {
        // Aggiungo utenti con password hashate (per sicurezza base)
        utenti.put("admin", hashPassword("admin123"));
        utenti.put("user1", hashPassword("password1"));
        utenti.put("user2", hashPassword("mypassword"));
        utenti.put("guest", hashPassword("guest"));
        utenti.put("marco", hashPassword("marco123"));
    }
    
    // Semplice hash SHA-256 per le password
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Fallback: restituisce la password in chiaro (non sicuro!)
            return password;
        }
    }
    
    public boolean verificaCredenziali(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        
        String passwordHashata = utenti.get(username);
        if (passwordHashata == null) {
            return false; // Utente non trovato
        }
        
        return passwordHashata.equals(hashPassword(password));
    }
    
    public void stampaUtentiDisponibili() {
        System.out.println("Utenti disponibili nel sistema:");
        for (String username : utenti.keySet()) {
            System.out.println("- " + username);
        }
    }
    
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java SistemaLogin <username> <password>");
            System.out.println("\nUtenti di test disponibili:");
            System.out.println("- admin / admin123");
            System.out.println("- user1 / password1");
            System.out.println("- user2 / mypassword");
            System.out.println("- guest / guest");
            System.out.println("- marco / marco123");
            return;
        }
        
        String username = args[0];
        String password = args[1];
        
        SistemaLogin sistema = new SistemaLogin();
        
        System.out.println("=== SISTEMA DI LOGIN ===");
        System.out.println("Tentativo di login per utente: " + username);
        
        if (sistema.verificaCredenziali(username, password)) {
            System.out.println("Login effettuato con successo!");
            System.out.println("Benvenuto, " + username + "!");
        } else {
            System.out.println("Credenziali non valide!");
            System.out.println("Username o password errati.");
            
            System.out.println("\nSuggerimento:");
            sistema.stampaUtentiDisponibili();
        }
    }
}