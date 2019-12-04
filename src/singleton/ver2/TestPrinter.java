package singleton.ver2;

public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = Printer.getPrinter();
        printer.showMessage();
    }

}
