package huytq.example;

import java.util.logging.Logger;

public class InsecureLogin {
    private static Logger logger = Logger.getLogger(InsecureLogin.class.getName());

    public static void login(String username, String password) {
        if(username.equals("admin") && password.equals("12345")) {
            logger.info("Login Successful");
        } else {
            logger.warning("Login Failed");
        }
    }

    public void printUserInfo(String user){
        if(user != null && !user.isEmpty()){
            logger.info("User: " + user);
        }
    }

    public void doNothing(){

    }
}
