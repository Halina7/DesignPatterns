package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.Kwacz;
import strategy.strategiaKaczki.latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka{

    public DzikaKaczka(){
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydla();

    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem dzika kaczka ...");
    }
}
