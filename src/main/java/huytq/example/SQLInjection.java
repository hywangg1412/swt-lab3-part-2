package huytq.example;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SQLInjection {
    private static final Logger logger = Logger.getLogger(SQLInjection.class.getName());
    public static void main(String[] args) {

        String userInput = "' OR '1'='1";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        logger.log(Level.INFO, "Executing query: {0}", query);
    }
}
