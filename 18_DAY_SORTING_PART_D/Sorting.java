public class Sorting {

    // Main Quick Sort function using recursion
    public static void quickSort(int arr[], int si, int ei) {
        // Base case: if the subarray has one or no elements, it's already sorted
        if (si >= ei)
            return;

        // Get the index where the pivot ends up after partitioning
        int pvIdx = getPartitionIdx(arr, si, ei);

        // Recursively sort the elements before and after the pivot
        quickSort(arr, si, pvIdx - 1); // sort left half
        quickSort(arr, pvIdx + 1, ei); // sort right half
    }

    // Function to place the pivot element at its correct sorted position
    // and rearrange smaller and larger elements around it
    public static int getPartitionIdx(int arr[], int si, int ei) {
        int pivot = arr[ei]; // Choosing the last element as pivot
        int i = si - 1; // Pointer for placing smaller elements

        // Loop through the array and move elements smaller than pivot to the left
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j] to place smaller element at correct position
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Finally, place the pivot at its correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // Return the pivot index
    }

    // Utility function to print the array in a readable format
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }

    // Main method to run the sorting and print the result
    public static void main(String args[]) {
        int arr[] = { 23, 21, 55, 12, 13, 45 };

        // Call Quick Sort on the entire array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        printArr(arr);
    }
}

