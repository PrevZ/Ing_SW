
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animale> animali = new ArrayList<>();

        Cane cane = new Cane("Rex");
        Gatto gatto = new Gatto("Garfield");

        animali.add(cane);
        animali.add(gatto);

        for (Animale animale : animali) {
            System.out.println(animale.getNome());
            animale.emettiVerso();
            animale.muoviti();
        }
    }
}
