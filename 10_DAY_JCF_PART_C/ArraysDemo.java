import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 9 };

        // toString() - Print array as string
        System.out.println("Original array: " + Arrays.toString(numbers));

        // sort() - Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // binarySearch() - Search for an element (array must be sorted)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);

        // fill() - Fill the entire array with a single value
        Arrays.fill(numbers, 0);
        System.out.println("After fill: " + Arrays.toString(numbers));

        // equals() - Compare two arrays
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println("Arrays equal? " + Arrays.equals(a, b));
    }
}

// output
/*
 * Original array: [5, 3, 8, 1, 9]
 * Sorted array: [1, 3, 5, 8, 9]
 * Index of 8: 3
 * After fill: [0, 0, 0, 0, 0]
 * Arrays equal? true
 */