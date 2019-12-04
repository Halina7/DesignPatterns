package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.Piszcz;
import strategy.strategiaKaczki.latanie.Ilatanie;
import strategy.strategiaKaczki.latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(){
        kwakanieInterface = new Piszcz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem gumowa kaczka :)");
    }
}
