// Classe principale
import java.util.ArrayList;
import java.util.List;

public class TestAnimali {
    public static void main(String[] args) {
        List<Animale> animali = new ArrayList<>();
        animali.add(new Cane());
        animali.add(new Gatto());
        animali.add(new Cane());
        
        for (Animale animale : animali) {
            System.out.println("Verso: " + animale.verso());
        }
    }
}
