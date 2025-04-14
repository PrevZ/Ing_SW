// Classe principale
public class TestContatore {
    public static void main(String[] args) {
        // Contatore per numeri
        Integer[] numeri = {1, 2, 3, 4, 5};
        Contatore<Integer> contatoreNumeri = new Contatore<>(numeri);
        
        // Contatore per stringhe
        String[] parole = {"ciao", "mondo", "java", "programming"};
        Contatore<String> contatoreStringhe = new Contatore<>(parole);
        
        System.out.println("Numero di elementi nell'array di interi: " + contatoreNumeri.conta());
        System.out.println("Numero di elementi nell'array di stringhe: " + contatoreStringhe.conta());
    }
}
