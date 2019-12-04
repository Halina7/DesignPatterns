package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.Kwacz;
import strategy.strategiaKaczki.latanie.LatamBoMamSkrzydla;

public class SuperSzybkaKaczka extends Kaczka {

    public SuperSzybkaKaczka(){
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem super szybka kaczka!");
    }
}
