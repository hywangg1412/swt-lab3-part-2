package huytq.example;

import java.util.logging.Logger;

public class NullPointer {
    private static final Logger logger = Logger.getLogger(NullPointer.class.getName());

    public static void main(String[] args) {
        String text = args.length > 0 ? args[0] : null;

        if (text != null && !text.isEmpty()) {
            logger.info("Text is not empty");
        } else {
            logger.warning("Text is null or empty");
        }
    }
}
