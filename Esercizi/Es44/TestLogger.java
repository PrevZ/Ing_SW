public class TestLogger {
    public static void main(String[] args) {
        // Ottengo l'istanza del Logger (Singleton)
        Logger logger = Logger.getInstance();
        
        System.out.println("=== TEST LOGGER SINGLETON ===");
        
        // Genero diversi tipi di log
        logger.info("Applicazione avviata");
        logger.info("Caricamento configurazione...");
        
        // Simulo alcuni eventi
        simulaOperazioni(logger);
        
        logger.info("Applicazione terminata correttamente");
        
        // Verifico che sia effettivamente un singleton
        Logger logger2 = Logger.getInstance();
        System.out.println("\nVerifica Singleton:");
        System.out.println("logger == logger2: " + (logger == logger2));
        
        logger2.info("Questo messaggio viene dallo stesso Logger");
    }
    
    private static void simulaOperazioni(Logger logger) {
        logger.info("Inizio elaborazione dati");
        
        try {
            // Simulo un'operazione che potrebbe fallire
            boolean operazioneRiuscita = Math.random() > 0.3;
            
            if (operazioneRiuscita) {
                logger.info("Operazione completata con successo");
                logger.debug("Dettagli debug: operazione eseguita in 120ms");
            } else {
                throw new RuntimeException("Errore simulato");
            }
            
        } catch (Exception e) {
            logger.error("Errore durante l'operazione: " + e.getMessage());
            logger.warning("Tentativo di recupero automatico");
            logger.info("Recupero completato");
        }
        
        logger.info("Salvataggio dati completato");
    }
}