package singleton.ver2;

public class Printer {

    private static Printer printer;

    private Printer(){
        System.out.println("Private printer");
    }

    public static Printer getPrinter(){
        if (printer == null){
            printer = new Printer();
        }
        return printer;
    }

    public void showMessage(){
        System.out.println("Helo! It's printing");
    }
}
