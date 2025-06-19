package huytq.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OvercatchingExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExample.class.getName());

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 10;
            }

            int index = 2;
            int value = arr[index];

            logger.log(Level.INFO, "Value at index {0}: {1}", new Object[]{index, value});
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.SEVERE, "Array index out of bounds", e);
        }
    }
}
