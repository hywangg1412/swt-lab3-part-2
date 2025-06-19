package huytq.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ResourceLeak {
    private static final Logger logger = Logger.getLogger(ResourceLeak.class.getName());
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.severe("Error reading file: " + e.getMessage());
        }
    }
}
