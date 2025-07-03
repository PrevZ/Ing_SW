// Classe principale
public class TestForme {
    public static void main(String[] args) {
        Forma[] forme = new Forma[3];
        forme[0] = new Cerchio(5);
        forme[1] = new Rettangolo(4, 6);
        forme[2] = new Cerchio(3);
        
        for (int i = 0; i < forme.length; i++) {
            System.out.println("Area della forma " + (i+1) + ": " + forme[i].area());
        }
    }
}
