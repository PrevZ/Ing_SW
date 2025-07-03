package Es9;

// Classe Dipartimento
public class Dipartimento {
    private String nome;
    private String sede;
    private Aula[] aule;

    public Dipartimento(String nome, String sede, int numeroAule) {
        this.nome = nome;
        this.sede = sede;
        this.aule = new Aula[numeroAule];
        for (int i = 0; i < numeroAule; i++) {
            this.aule[i] = new Aula(i + 1, 50, "Attrezzature standard");
        }
    }

    public String getNome() {
        System.out.println("Restituisco il nome del dipartimento: " + nome);
        return nome;
    }

    public String getSede() {
        System.out.println("Restituisco la sede del dipartimento: " + sede);
        return sede;
    }

    public Aula[] getAule() {
        System.out.println("Restituisco le aule del dipartimento: " + aule.length);
        return aule;
    }
}
