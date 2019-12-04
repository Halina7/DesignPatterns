package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.Piszcz;

import java.util.ArrayList;
import java.util.List;

public class TestKaczki {
    public static void main(String[] args) {
        List<Kaczka> kaczki = new ArrayList<>();

        Kaczka dzika = new DzikaKaczka();
        kaczki.add(dzika);

        Kaczka plaskonos = new PlaskonosKaczka();
        kaczki.add(plaskonos);

        Kaczka gumowa = new GumowaKaczka();
        kaczki.add(gumowa);

        Kaczka szybka = new SuperSzybkaKaczka();
        kaczki.add(szybka);

        for(Kaczka kaczka: kaczki){
            kaczka.wyswietl();
            kaczka.wykoanjLec();
            kaczka.wykonajKwacz();
            kaczka.plywaj();
            System.out.println();
        }

        plaskonos.setKwakanieInterface(new Piszcz());

        for(Kaczka kaczka: kaczki){
            kaczka.wyswietl();
            kaczka.wykoanjLec();
            kaczka.wykonajKwacz();
            kaczka.plywaj();
            System.out.println();
        }

    }

}
