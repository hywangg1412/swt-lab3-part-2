package huytq.example;

import java.util.logging.Logger;

public class HardcodedCredentials {
    private static final Logger logger = Logger.getLogger(HardcodedCredentials.class.getName());

    public static void main(String[] args) {
        String username = "admin";
        String password = "123456"; // hardcoded password
        if(authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }
    }

    public static boolean authenticate(String user, String pass) {
        // Check for null or empty values
        if (user == null || pass == null || user.isEmpty() || pass.isEmpty()) {
            return false;
        }
        // Dummy authentication logic
        return user.equals("admin") && pass.equals("123456");
    }
}

