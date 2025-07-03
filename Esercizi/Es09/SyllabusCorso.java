package Es9;

// Classe SyllabusCorso
public class SyllabusCorso {
    private String obiettivi;
    private String bibliografia;

    public SyllabusCorso(String obiettivi, String bibliografia) {
        this.obiettivi = obiettivi;
        this.bibliografia = bibliografia;
    }

    public String getObiettivi() {
        System.out.println("Obiettivi del corso: " + obiettivi);
        return obiettivi;
    }

    public String getBibliografia() {
        System.out.println("Bibliografia del corso: " + bibliografia);
        return bibliografia;
    }
}