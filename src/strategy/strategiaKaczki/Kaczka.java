package strategy.strategiaKaczki;

import strategy.strategiaKaczki.kwakanie.IKwakanie;
import strategy.strategiaKaczki.latanie.Ilatanie;

public abstract class Kaczka {
    protected IKwakanie kwakanieInterface;
    protected Ilatanie latanieInterface;

    public void wykonajKwacz(){
        kwakanieInterface.kwacz();
    }

    public void wykoanjLec(){
        latanieInterface.lec();
    }

    public void plywaj(){
        System.out.println("Plusk, plusk !");
    }

    public abstract void wyswietl();

    public void setKwakanieInterface(IKwakanie kwakanieInterface){
        this.kwakanieInterface = kwakanieInterface;
    }

}
