package huytq.example;

import java.util.logging.Logger;

class User {
    private static final Logger logger = Logger.getLogger(User.class.getName());

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        logger.info("Name: " + name + ", Age: " + age);
    }

    // Optional: main() để tránh cảnh báo không sử dụng class/method
    public static void main(String[] args) {
        User user = new User("Huy Quang", 25);
        user.display();
    }
}
