public abstract class MezzoDiTrasporto implements Veicolo{ 
    private String targa;

    public MezzoDiTrasporto(String targa){
        this.targa = targa;
    }

    public String getTarga(){
            return this.targa;
    }

    @Override
    public String getTipo(){
        return "Auto";
    }

    @Override
    public abstract void avvia();

    @Override
    public abstract void ferma();
}