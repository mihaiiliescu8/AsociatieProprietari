package AsociatieDeProprietari;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Runner {
    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {

        /*Apartament apartament1 = new Apartament(1, 57);
        Apartament apartament2 = new Apartament(3, 64);
        Apartament apartament3 = new Apartament(2, 35);

        List<Apartament> list = new ArrayList<Apartament>();
        list.add(apartament1);
        list.add(apartament2);
        list.add(apartament3);

        Asociatie asociatieLocatari = new Asociatie(list);

        Locatar locatar1 = new Locatar("Marcel", apartament1);
        Locatar locatar2 = new Locatar("Gigel", apartament2);
        Locatar locatar3 = new Locatar("Dorel", apartament3);

        apartament1.adLoc(locatar1);
        apartament2.adLoc(locatar2);
        apartament3.adLoc(locatar3);

        LOGGER.info( asociatieLocatari.sortByName()  + " ");
        asociatieLocatari.save();*/

        Asociatie aaa = Asociatie.load();
        System.out.println(aaa);
    }
}
