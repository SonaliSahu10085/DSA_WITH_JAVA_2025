import java.util.*;
import java.util.LinkedList;
import java.util.Vector;

public class Practice {

    // Solid Rectangle
    public static void solidRectangle(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Half Pyramid
    public static void leftHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //  Right Half Pyramid
    public static void rightHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    

    public static void collectionDemo() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.71);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
        System.out.println("LinkedList: " + linkedList);
    }

    

    // Print sum of first N numbers
    public static int sumRecursion(int n) {
        if (n == 0) return 0;
        return n + sumRecursion(n - 1);
    }

    // Check if string is palindrome
    public static boolean isPalindrome(String str, int l, int r) {
        if (l >= r) return true;
        if (str.charAt(l) != str.charAt(r)) return false;
        return isPalindrome(str, l + 1, r - 1);
    }



    // Hashing using Array (for 1 <= element <= 100)
    public static int[] frequencyUsingArray(int[] arr) {
        int[] freq = new int[101];
        for (int num : arr) {
            freq[num]++;
        }
        return freq;
    }

    // Hashing using HashMap 
    public static Map<Integer, Integer> frequencyUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    
    public static void main(String[] args) {

        System.out.println("Day 8: Solid Rectangle");
        solidRectangle(4, 5);

        System.out.println("\nDay 9: Left Half Pyramid");
        leftHalfPyramid(5);

        System.out.println("\nDay 10: Right Half Pyramid");
        rightHalfPyramid(5);

        System.out.println("\nDay 11: Java Collections");
        collectionDemo();

        System.out.println("\nDay 12: Recursion Sum of N (5): " + sumRecursion(5));
        System.out.println("Is 'madam' Palindrome? " + isPalindrome("madam", 0, 4));

        System.out.println("\nDay 13-14: Hashing Examples");
        int[] arr = {1, 2, 2, 3, 3, 3, 100};
        int[] freqArray = frequencyUsingArray(arr);
        System.out.println("Frequency of 3 using array: " + freqArray[3]);

        Map<Integer, Integer> freqMap = frequencyUsingMap(arr);
        System.out.println("Frequency Map: " + freqMap);
    }
}
