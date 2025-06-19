package huytq.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchGenericExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExample.class.getName());

    public static void main(String[] args) {
        String s = args.length > 0 ? args[0] : null;

        if (s != null && !s.isEmpty()) {
            logger.log(Level.INFO, "Length of s: {0}", s.length());
        } else {
            logger.warning("String s is null or empty");
        }
    }
}
