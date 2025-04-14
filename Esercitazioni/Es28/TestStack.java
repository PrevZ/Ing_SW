public class TestStack {
    public static void main(String[] args) {
        // Creo uno stack di stringhe
        Stack<String> stackStringhe = new Stack<>();
        
        // Testo il metodo push
        System.out.println("Inserisco elementi nello stack:");
        stackStringhe.push("primo");
        System.out.println("Inserito: primo");
        stackStringhe.push("secondo");
        System.out.println("Inserito: secondo");
        stackStringhe.push("terzo");
        System.out.println("Inserito: terzo");
        
        // Testo il metodo peek
        System.out.println("\nElemento in cima (peek): " + stackStringhe.peek());
        
        // Testo il metodo pop
        System.out.println("\nEstraggo elementi con pop:");
        while (!stackStringhe.isEmpty()) {
            System.out.println("Estratto: " + stackStringhe.pop());
        }
        
        // Verifico che lo stack sia vuoto
        System.out.println("\nLo stack è vuoto? " + stackStringhe.isEmpty());
        
        // Test di eccezione
        try {
            stackStringhe.pop();
        } catch (Exception e) {
            System.out.println("Eccezione catturata: " + e.getClass().getSimpleName() + 
                              " (Tentativo di pop da stack vuoto)");
        }
    }
}
