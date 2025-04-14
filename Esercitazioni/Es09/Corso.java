package Es9;

// Classe Corso
public class Corso {
    private String codice;
    private String nome;
    private int crediti;
    private SyllabusCorso syllabus;
    private Dipartimento dipartimento;

    public Corso(String codice, String nome, int crediti, Dipartimento dipartimento) {
        this.codice = codice;
        this.nome = nome;
        this.crediti = crediti;
        this.syllabus = new SyllabusCorso("Obiettivi del corso", "Bibliografia del corso");
        this.dipartimento = dipartimento;
    }

    public String getCodice() {
        System.out.println("Restituisco il codice del corso: " + codice);
        return codice;
    }

    public String getNome() {
        System.out.println("Restituisco il nome del corso: " + nome);
        return nome;
    }

    public int getCrediti() {
        System.out.println("Restituisco i crediti del corso: " + crediti);
        return crediti;
    }

    public SyllabusCorso getSyllabus() {
        System.out.println("Restituisco il syllabus del corso: " + syllabus.getObiettivi() + ", " + syllabus.getBibliografia());
        return syllabus;
    }

    public Dipartimento getDipartimento() {
        System.out.println("Restituisco il dipartimento del corso: " + dipartimento.getNome() + ", " + dipartimento.getSede());
        return dipartimento;
    }
}
