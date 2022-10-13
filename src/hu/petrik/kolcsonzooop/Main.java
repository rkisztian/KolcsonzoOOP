package hu.petrik.kolcsonzooop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Kolcsonozheto> katalogus = new ArrayList<>();
    private static List<Dvd> dvdk = new ArrayList<>();

    public static void main(String[] args) {

        Konyv konyv = new Konyv("Majom Bence", "J.R.R","ASD");
        Konyv konyv2 = new Konyv("Majom Noel", "J.R.R","ASD");
        Konyv konyv3 = new Konyv("Majom Luki", "J.R.R","ASD");
        Konyv konyv4 = new Konyv("Majom Geri", "J.R.R","ASD");

        Dvd dvd1 = new Dvd("Galaxis Örzőid", 134);
        Dvd dvd2 = new Dvd("Galaxis Örzőid 2", 136);
        Dvd dvd3 = new Dvd("Galaxis Örzőid 3", 135);

        Ujsag ujsag1 = new Ujsag("Képes Sport", 2000, 12);
        Ujsag ujsag2 = new Ujsag("Lányos Sport", 2010, 12);
        Ujsag ujsag3 = new Ujsag("Fius Sport", 2019, 12);

        System.out.println(konyv.megjelentendoNev());
        System.out.println(konyv.getIsbn());
        katalogus.add(konyv);
        katalogus.add(konyv2);
        katalogus.add(konyv3);
        katalogus.add(konyv4);

        katalogus.add(ujsag1);
        katalogus.add(ujsag2);
        katalogus.add(ujsag3);

        katalogus.add(dvd1);
        katalogus.add(dvd2);
        katalogus.add(dvd3);

        dvdk.add(dvd1);
        dvdk.add(dvd2);
        dvdk.add(dvd3);


        for (Kolcsonozheto k : katalogus){
            System.out.println(k.megjelentendoNev());
            if (k instanceof Konyv){
                System.out.println("\t"+((Konyv) k).getIsbn());
            }

        }

        System.out.println();
        Collections.sort(dvdk);
        for (Dvd k : dvdk){
            System.out.println(k.megjelentendoNev());

        }

    }
}
