import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VoceDiario {
    private String testo;
    private LocalDate data;
    
    public VoceDiario(String testo, LocalDate data) {
        this.testo = testo;
        this.data = data;
    }
    
    public String getTesto() {
        return testo;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter) + " - " + testo;
    }
}
