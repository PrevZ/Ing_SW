public class TestPersona {
    public static void main(String[] args) {
        // Creo una persona
        Persona p = new Persona("Mario Rossi", 30);
        
        // Stampo i dati iniziali
        System.out.println("Dati iniziali:");
        System.out.println(p);
        
        // Modifico i dati con i metodi pubblici
        p.setNome("Mario Bianchi");
        p.setEta(32);
        
        // Stampo i dati modificati
        System.out.println("\nDati modificati:");
        System.out.println(p);
    }
}
