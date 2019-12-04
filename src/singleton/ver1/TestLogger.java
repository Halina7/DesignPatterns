package singleton.ver1;

import singleton.ver1.Logger;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.logToSystem();
    }
}
