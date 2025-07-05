public class HashingBasics {
    // Create a frequency array to store occurrences
    // Adjust size based on max possible element in arr
    static int[] hash = new int[100];

    // Function to calculate frequency of all elements
    public static void buildHash(int[] arr) {
        for (int num : arr) {
            hash[num]++;
        }
    }
    // Function to return the count of a queried number
    public static int fn(int q, int[] arr) {
        return hash[q];
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6, 6, 6, 7, 5 };

        // Build the hash array from input array
        buildHash(arr);

        System.out.println("Occurrences:");
        int querys[] = { 1, 3, 4, 2, 5, 12 };
        for (int q : querys) {
            System.out.println(q + " = " + fn(q, arr));
        }
    }
}
