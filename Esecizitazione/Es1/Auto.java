public class Auto extends MezzoDiTrasporto {
    public Auto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("Auto con targa " + getTarga() + " avviata");
    }

    @Override
    public void ferma() {
        System.out.println("Auto con targa " + getTarga() + " fermata");
    }

    @Override
    public String getTipo() {
        return "Auto";
    }
}