package huytq.example;

import java.util.logging.Logger;
import java.util.logging.Level;

public class UnreachableCode {
    private static final Logger LOG = Logger.getLogger(UnreachableCode.class.getName());
    public static int getNumber() {
        if (LOG.isLoggable(Level.INFO)) {
            LOG.info("Getting number");
        }
        return 42;
    }

    public static void main(String[] args) {
        if (LOG.isLoggable(Level.INFO)) {
            LOG.info(String.valueOf(getNumber()));
        }
    }
}
