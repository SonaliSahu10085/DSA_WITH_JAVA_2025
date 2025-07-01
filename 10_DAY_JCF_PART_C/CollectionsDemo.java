import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

        // sort() - Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // reverse() - Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // max() - Find maximum element
        System.out.println("Max element: " + Collections.max(numbers));

        // min() - Find minimum element
        System.out.println("Min element: " + Collections.min(numbers));

        // frequency() - Count occurrences of an element
        System.out.println("Frequency of 9: " + Collections.frequency(numbers, 9));

        // shuffle() - Randomly shuffle elements
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // swap() - Swap two elements
        Collections.swap(numbers, 0, 2);
        System.out.println("After swap: " + numbers);

        // fill() - Fill list with a single value
        Collections.fill(numbers, 0);
        System.out.println("After fill: " + numbers);
    }
}

// Output
/*
 * Sorted list: [1, 2, 5, 7, 9]
 * Reversed list: [9, 7, 5, 2, 1]
 * Max element: 9
 * Min element: 1
 * Frequency of 9: 1
 * Shuffled list: [5, 2, 9, 1, 7] // (shuffled output will vary)
 * After swap: [9, 2, 5, 1, 7]
 * After fill: [0, 0, 0, 0, 0]
 */