package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.NieKwacz;
import strategy.strategiaKaczki.latanie.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka(){
        kwakanieInterface = new NieKwacz();
        latanieInterface = new LatamBoMamSkrzydla();

    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem kaczka Płaskonos");
    }
}
