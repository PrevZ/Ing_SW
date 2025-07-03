package Es9;

// Classe Aula
public class Aula {
    private  int numero;
    private int capacita;
    private String attrezzatura;

    public Aula(int numero, int capacita, String attrezzatura) {
        this.numero = numero;
        this.capacita = capacita;
        this.attrezzatura = attrezzatura;
    }

    public int getNumero() {
        System.out.println("Restituisco il numero dell'aula: " + numero);
        return numero;
    }

    public int getCapacita() {
        System.out.println("Restituisco la capacità dell'aula: " + capacita);
        return capacita;
    }

    public String getAttrezzatura() {
        System.out.println("Restituisco l'attrezzatura dell'aula: " + attrezzatura);
        return attrezzatura;
    }
}
