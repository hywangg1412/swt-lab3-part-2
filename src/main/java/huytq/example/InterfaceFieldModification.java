package huytq.example;

class Constants {
    public static final int MAX_USERS = 100;
}

public class InterfaceFieldModification {
    public static void main(String[] args) {
        // Constants.MAX_USERS = 200; // Compile-time error
        int max = Constants.MAX_USERS;
        System.out.println("Max users: " + max);
    }
}
