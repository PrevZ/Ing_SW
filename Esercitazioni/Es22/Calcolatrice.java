public class Calcolatrice {
    public static void main(String[] args) {
        // Controllo se gli argomenti sono corretti
        if (args.length != 3) {
            System.out.println("Uso: java Calcolatrice <numero1> <operazione> <numero2>");
            System.out.println("Operazioni supportate: +, -, *, /");
            return;
        }
        
        try {
            double num1 = Double.parseDouble(args[0]);
            String operazione = args[1];
            double num2 = Double.parseDouble(args[2]);
            double risultato = 0;
            
            switch (operazione) {
                case "+":
                    risultato = num1 + num2;
                    break;
                case "-":
                    risultato = num1 - num2;
                    break;
                case "*":
                    risultato = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Errore: divisione per zero!");
                        return;
                    }
                    risultato = num1 / num2;
                    break;
                default:
                    System.out.println("Operazione non valida!");
                    return;
            }
            
            System.out.printf("%.2f %s %.2f = %.2f\n", num1, operazione, num2, risultato);
            
        } catch (NumberFormatException e) {
            System.out.println("Errore: inserire numeri validi!");
        }
    }
}
