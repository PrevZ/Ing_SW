package Es11;

import java.util.*;

// Class Reparto
public class Reparto {
    private String nome;
    private int numeroStanze;
    private Medico primario;
    private List<PersonaleSanitario> personale;
    private List<Paziente> pazienti;

    public Reparto(String nome, int numeroStanze, Medico primario) {
        this.nome = nome;
        this.numeroStanze = numeroStanze;
        this.primario = primario;
        this.personale = new ArrayList<>();
        this.pazienti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroStanze() {
        return numeroStanze;
    }

    public Medico getPrimario() {
        return primario;
    }

    public List<PersonaleSanitario> getPersonale() {
        return personale;
    }

    public List<Paziente> getPazienti() {
        return pazienti;
    }

    public void assegnaPersonale(PersonaleSanitario persona) {
        System.out.println("Assegno " + persona.getNome() + " " + persona.getCognome() + " al reparto " + nome);
        personale.add(persona);
    }
    
    public void ricoveraPaziente(Paziente paziente) {
        System.out.println("Ricovero il paziente " + paziente.getNome() + " " + paziente.getCognome() + " nel reparto " + nome);
        pazienti.add(paziente);
    }
    
    public void dimetti(Paziente paziente) {
        System.out.println("Dimetto il paziente " + paziente.getNome() + " " + paziente.getCognome() + " dal reparto " + nome);
        pazienti.remove(paziente);
    }
}
