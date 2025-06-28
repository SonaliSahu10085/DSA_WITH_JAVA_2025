
import java.util.*;

public class Largest {
    public static void getLargest(int numbers[]) {
        int max = Integer.MIN_VALUE; // -infinity
        int min = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } 
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Largest number = " + max);
        System.out.println("Smallest number = " + min);

    }

    public static void main(String args[]) {
        int numbers[] = { 12, 43, 909, 78, 90 };
        getLargest(numbers);
    }
}
