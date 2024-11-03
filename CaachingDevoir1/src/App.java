import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import models.Basket;
import services.FormatageDate;
import services.FormatageNombre;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        demarrerExercice1A();
        formaterExemples();
    }

    public static void demarrerExercice1A() {
        ArrayList<Basket> basket = new ArrayList<>();
        basket.add(new Basket("Nike", "AirForce1", 37.5, 124.90));
        basket.add(new Basket("Adidas", "Campus", 38.0, 139.0));
        basket.add(new Basket("Puma", "Palermo", 41.5, 67.59));
        basket.add(new Basket("Adidas", "Gazelle", 36.5, 112.65));
        basket.add(new Basket("New Balance", "550", 39.0, 150.0));
        System.out.println("================================");
        System.out.println("Basket Liste :");
        System.out.println("================================");
        afficherBasket(basket);

        // Tri par taille puis par prix
        Collections.sort(basket);
        System.out.println("================================");
        System.out.println(" Liste trié par taille puis par prix:");
        System.out.println("================================");
        afficherBasket(basket);

        // Tri par marque puis par prix
        basket.sort((b1, b2) -> {
            int resultat = 0;
            int marqueCompare = b1.getMarque().compareTo(b2.getMarque());
            if (marqueCompare != 0) {
                resultat = marqueCompare;
            } else {
                resultat = Double.compare(b1.getPrix(), b2.getPrix());
            }
            return resultat;
        });
        System.out.println("================================");
        System.out.println(" List Trié par marque puis par prix:");
        System.out.println("================================");
        afficherBasket(basket);
    }

    public static void afficherBasket(ArrayList<Basket> basket) {
        for (Basket b : basket) {
            System.out.println(b);
        }
    }

    public static void formaterExemples() {

        FormatageDate formatageDate = new FormatageDate();
        LocalDate today = LocalDate.now();
        System.out.println("================================");
        System.out.println("Date format JJ.MM.AAAA: " + formatageDate.formatageDate1(today));
        System.out.println("Date format AAAA.MM.JJ: " + formatageDate.formatageDate2(today));
        System.out.println("================================");

        FormatageNombre formatageNombre = new FormatageNombre();
        System.out.println("================================");
        System.out.println("Nombre entier formaté : " + formatageNombre.formatNombreEntier(123456789));
        System.out.println("Nombre décimal formaté : " + formatageNombre.formatNombreDecimal(123456789));
        System.out.println("================================");
    }
}
