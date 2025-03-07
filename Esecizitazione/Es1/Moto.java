public class Moto extends MezzoDiTrasporto {
    public Moto(String targa) {
        super(targa);
    }

    @Override
    public void avvia() {
        System.out.println("Moto con targa " + getTarga() + " avviata");
    }

    @Override
    public void ferma() {
        System.out.println("Moto con targa " + getTarga() + " fermata");
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}