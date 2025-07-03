public class Parcheggio {
    private String nome;
    private PostoAuto[] posti;
    private int postiTotali;
    
    public Parcheggio(String nome, int numeroPostiTotali) {
        this.nome = nome;
        this.postiTotali = numeroPostiTotali;
        this.posti = new PostoAuto[numeroPostiTotali];
        
        // Inizializzo tutti i posti
        for (int i = 0; i < numeroPostiTotali; i++) {
            posti[i] = new PostoAuto(i + 1);
        }
    }
    
    public boolean parcheggiaAuto(Auto auto) {
        // Cerco il primo posto libero
        for (PostoAuto posto : posti) {
            if (!posto.isOccupato()) {
                posto.occupaPosto(auto);
                System.out.println("Auto " + auto.getTarga() + " parcheggiata nel posto " + posto.getNumero());
                return true;
            }
        }
        System.out.println("Parcheggio pieno! Impossibile parcheggiare " + auto.getTarga());
        return false;
    }
    
    public boolean rimuoviAuto(String targa) {
        for (PostoAuto posto : posti) {
            if (posto.isOccupato() && posto.getAutoPresente().getTarga().equals(targa)) {
                Auto autoUscente = posto.liberaPosto();
                System.out.println("Auto " + autoUscente.getTarga() + " rimossa dal posto " + posto.getNumero());
                return true;
            }
        }
        System.out.println("Auto con targa " + targa + " non trovata nel parcheggio");
        return false;
    }
    
    public int getPostiLiberi() {
        int liberi = 0;
        for (PostoAuto posto : posti) {
            if (!posto.isOccupato()) {
                liberi++;
            }
        }
        return liberi;
    }
    
    public int getPostiOccupati() {
        return postiTotali - getPostiLiberi();
    }
    
    public void stampaStatoParcheggio() {
        System.out.println("\n=== STATO PARCHEGGIO " + nome + " ===");
        System.out.println("Posti totali: " + postiTotali);
        System.out.println("Posti occupati: " + getPostiOccupati());
        System.out.println("Posti liberi: " + getPostiLiberi());
        System.out.println("\nDettaglio posti:");
        
        for (PostoAuto posto : posti) {
            System.out.println(posto);
        }
    }
    
    public Auto cercaAuto(String targa) {
        for (PostoAuto posto : posti) {
            if (posto.isOccupato() && posto.getAutoPresente().getTarga().equals(targa)) {
                return posto.getAutoPresente();
            }
        }
        return null;
    }
}