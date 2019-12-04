package singleton.ver1;

public class Logger {

    private static Logger logger = new Logger();

    private Logger(){
        System.out.println("We create object Logger");
    }

    public static Logger getLogger(){
        return logger;
    }

    public void logToSystem(){
        System.out.println("Logging into system!");
    }
}
