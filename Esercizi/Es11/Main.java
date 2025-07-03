package Es11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di un medico
        Medico dottore = new Medico("Mario", "Rossi", "RSSMRA70A01H501X", 
                                    "MED123", "Cardiologia", 15, 2);
        
        // Creazione di un infermiere
        Infermiere infermiere = new Infermiere("Laura", "Bianchi", "BNCLRA80A41H501Y", 
                                              "INF456", "Assistenza cardiologica", 8, "Cardiologia");
        
        // Creazione di un paziente
        Paziente paziente = new Paziente("Giuseppe", "Verdi", "VRDGPP65A01H501Z", 
                        "PAZ789", new java.util.Date(2003, 11, 23));
        
        // Creazione di un reparto
        Reparto cardiologia = new Reparto("Cardiologia", 20, dottore);
        
        // Assegnazione del personale al reparto
        cardiologia.assegnaPersonale(infermiere);
        
        // Ricovero del paziente
        cardiologia.ricoveraPaziente(paziente);
        
        // L'infermiere svolge il turno
        infermiere.svolgeTurno();
        
        // Il medico prescrive un farmaco
        dottore.prescriviFarmaco("Enalapril 20mg", paziente);
        
        // Registrazione ore di lavoro
        dottore.registraOreLavoro(8);
        infermiere.registraOreLavoro(12);
        
        // Calcolo degli stipendi
        double stipendioMedico = dottore.calcolaStipendio();
        double stipendioInfermiere = infermiere.calcolaStipendio();
        
        // Ottenere informazioni dalla cartella clinica
        CartellaClinica cartella = paziente.getCartellaClinica();
        List<Visita> storiaVisite = cartella.getStoriaVisite();
        
        // Dimissione del paziente
        cardiologia.dimetti(paziente);
    }
}
