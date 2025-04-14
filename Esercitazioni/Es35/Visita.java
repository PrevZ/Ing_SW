// Classe Visita
public class Visita {
    private String data;
    private Paziente paziente;
    private Medico medico;
    private String diagnosi;
    private String terapia;
    
    public Visita(String data, Paziente paziente, Medico medico, String diagnosi, String terapia) {
        this.data = data;
        this.paziente = paziente;
        this.medico = medico;
        this.diagnosi = diagnosi;
        this.terapia = terapia;
    }
    
    public Paziente getPaziente() {
        return paziente;
    }
    
    @Override
    public String toString() {
        return "Data: " + data + "\nPaziente: " + paziente + 
               "\nMedico: " + medico + "\nDiagnosi: " + diagnosi + 
               "\nTerapia: " + terapia;
    }
}
