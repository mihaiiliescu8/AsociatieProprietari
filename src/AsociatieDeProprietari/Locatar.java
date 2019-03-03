package AsociatieDeProprietari;

import java.io.Serializable;
import java.util.Comparator;

public class Locatar implements Serializable {

    public static class comparatorByName implements Comparator<Locatar> {

        @Override
        public int compare(Locatar o1, Locatar o2) {
            return o1.nume.compareTo(o2.nume);
        }
    }

    private String nume;
    private Apartament ap;

    public Locatar(String nume, Apartament ap) {
        this.nume = nume;
        this.ap = ap;
    }

    @Override
    public String toString() {

        return "Nume locatar: " + nume + "; " + "Numar apartament: " + ap.getNumumarApartament();
    }
}
