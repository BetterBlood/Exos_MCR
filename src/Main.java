import Exo_01.*;
import Exo_02.*;

public class Main {
    public static void main(String[] args) {

        // region Exo01 - Part - Principe d’ouverture/fermeture
        exo_01_compute();
        // endregion

        // region Exo02 - Factory - Iterateur - Collection
        exo_02_affichage();
        // endregion

    }

    // region Exo01 - Part - Principe d’ouverture/fermeture
    private static void exo_01_compute()
    {
        OurPart[] parts = {new Memory(30), new Memory(60, 0.75), new CPU(10)};
        System.out.println("total price : " + totalPrice(parts));
    }

    public static double totalPrice(OurPart[] parts)
    {
        double total = 0;
        for (OurPart p : parts)
            total += p.getPrice() * p.getProportion();
        return total;
    }
    // endregion

    // region Exo02 - Factory - Iterateur - Collection
    private static void exo_02_affichage()
    {
        List<Integer> l = new List<Integer>();
        l.add(1); l.add(2); l.add(3);
        Array<String> a = new Array<String>(3);
        a.add("one"); a.add("two"); a.add("three");
        for (Collection<?> c : new Collection<?>[] { l, a }) {
            Iterator<?> it = c.iterator(); // fabrication
            String s = "< ";
            while (it.hasNext())
                s += it.next() + " ";
            System.out.println(s + ">");
        }
    }
    // endregion
}