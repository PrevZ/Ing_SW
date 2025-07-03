public class FiltroNumeriPari {
    public static void main(String[] args) {
        // Dichiaro un array di interi
        int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Numeri pari:");
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
