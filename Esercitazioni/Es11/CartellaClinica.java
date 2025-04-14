package Es11;

import java.util.*;

// Classe CartellaClinica
public class CartellaClinica {
    private String codice;
    private Date dataApertura;
    private List<Visita> visite;

    public CartellaClinica(String codice, Date dataApertura) {
        this.codice = codice;
        this.dataApertura = dataApertura;
        this.visite = new ArrayList<>();
    }

    public String getCodice() {
        return codice;
    }

    public Date getDataApertura() {
        return dataApertura;
    }

    public void aggiungiVisita(Visita visita) {
        System.out.println("Aggiungo una nuova visita alla cartella clinica " + codice);
        visite.add(visita);
    }
    
    public List<Visita> getStoriaVisite() {
        System.out.println("Restituisco la storia delle visite dalla cartella clinica " + codice);
        return visite;
    }

}
