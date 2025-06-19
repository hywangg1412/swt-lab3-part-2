package huytq.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class PathTraversal {
    private static final Logger logger = Logger.getLogger(PathTraversal.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "../secret.txt";
        File file = new File(userInput);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            logger.info("Reading file: " + file.getPath());
            reader.close();
        }
    }
}
