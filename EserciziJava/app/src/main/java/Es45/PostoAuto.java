public class PostoAuto {
    private int numero;
    private boolean occupato;
    private Auto autoPresente;
    
    public PostoAuto(int numero) {
        this.numero = numero;
        this.occupato = false;
        this.autoPresente = null;
    }
    
    public boolean isOccupato() {
        return occupato;
    }
    
    public void occupaPosto(Auto auto) {
        if (!occupato) {
            this.occupato = true;
            this.autoPresente = auto;
        }
    }
    
    public Auto liberaPosto() {
        if (occupato) {
            Auto autoUscente = this.autoPresente;
            this.occupato = false;
            this.autoPresente = null;
            return autoUscente;
        }
        return null;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public Auto getAutoPresente() {
        return autoPresente;
    }
    
    @Override
    public String toString() {
        if (occupato) {
            return "Posto " + numero + ": OCCUPATO - " + autoPresente;
        } else {
            return "Posto " + numero + ": LIBERO";
        }
    }
}