package Es12;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Mario Rossi", 12345);
        Sviluppatore[] sviluppatore = new Sviluppatore[10];
        for (int i = 0; i < sviluppatore.length; i++) {
            sviluppatore[i] = new Sviluppatore("Developer " + (i + 1), 1000 + i);
        }

        for (Sviluppatore developer : sviluppatore) {
            developer.lavora();
            System.out.println("Paga: " + developer.calcolaPaga());
        }
    }
}
