package AsociatieDeProprietari;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Asociatie implements Serializable {

    List<Apartament> apList;

    Asociatie(List<Apartament> lista) {

        this.apList = lista;
    }

    @Override
    public String toString() {
        return apList + " ";
    }

    public List<Locatar> getAllLocUnsorted() {
        List<Locatar> tmpList = new ArrayList<>();

        //Varianta cu foreach
        for(Apartament e : apList) {
            //tmpList.addAll(e.getLocList());
            List<Locatar> obj = e.getLocList();
            tmpList.addAll(obj);
        }
        /*Varianta cu for clasic
        for(int i = 0; i < apList.size(); ++i) {
            //tmpList.addAll(apList.get(i).getLocList());
            List<Locatar> obj = apList.get(i).getLocList();
            tmpList.addAll(obj);
        }*/
        return tmpList;
    }

    public List<Locatar> sortByName() {
        ArrayList<Locatar> tmpLocatari = new ArrayList<>();
        for(Apartament apartament: apList) {
            tmpLocatari.addAll(apartament.getLocList());

        }
        Collections.sort(tmpLocatari, new Locatar.comparatorByName());
        return  tmpLocatari;
    }


    public void save(){

        try{
            FileOutputStream file = new FileOutputStream("asoc.db");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println("IOException is caught");
        }
    }



    public static Asociatie load(){

        Asociatie obj = null;
        try{
            FileInputStream file = new FileInputStream("asoc.db");
            ObjectInputStream in = new ObjectInputStream(file);

            obj = (Asociatie)in.readObject();

            in.close();
            file.close();
        }

        catch (IOException ex){

            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

}
