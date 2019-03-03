package AsociatieDeProprietari;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Apartament implements Serializable {

    int numarCamere;
    int numarApartament;
    List<Locatar> locList;

    public Apartament(int numarCamere, int numarApartament) {
       this.numarCamere = numarCamere;
       this.numarApartament = numarApartament;
       locList = new ArrayList<>();
    }

    public void adLoc(Locatar loc) {
        locList.add(loc);
    }

    public int getNumumarApartament() {
        return numarApartament;
    }

    public List<Locatar> getLocList() {
        return locList;
    }

    @Override
    public String toString() {
        return "" + "Numar camere: " + numarCamere + "; " +
                "Numar apartament: " + numarApartament + "; " + "Locatari: " + locList;
    }
}
