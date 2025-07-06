public class Sorting {
    // Description - Repeatedly Compares the adjacent elements and push the maximum
    // one at the end
    // Worst & Avg TC - O(n^2)
    // Best TC - O(n) - When array elements are already sorted and no swapping takes
    // place
    // Reference - https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/
    void bubble(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    // Description - Repeatedly selects the smallest element from the unsorted array
    // and swaps it with the first unsorted element
    // Worst & Avg TC - O(n^2)
    // Reference - https://www.geeksforgeeks.org/dsa/selection-sort-algorithm-2/
    void selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    // swapping logic
                    int temp = arr[j];
                    arr[j] = arr[minIdx];
                    arr[minIdx] = temp;
                }
            }
        }

    }

    // Description - Repeatedly Compares the adjacent elements and push the maximum
    // Worst & Avg TC - O(n^2)
    // Best TC - O(n)
    // Reference - https://www.geeksforgeeks.org/dsa/insertion-sort-algorithm/
    void insertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position
             * ahead of their current position
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // printArr() - For printing array elements
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.print("]");
    }

    public static void main(String args[]) {
        Sorting sort = new Sorting();

        // Executing Bubble Sort
        int arr1[] = { 1, 5, 6, 7, 8, 2 };
        sort.bubble(arr1);
        printArr(arr1); // [ 1 2 5 6 7 8 ]

        // // Executing Selection Sort
        int arr2[] = { 23, 65, 34, 89, 22, 11 };
        sort.selection(arr2);
        printArr(arr2); // [ 11 22 23 34 65 89 ]

        // // Executing Insertion Sort
        int arr3[] = { 56, 34, 22, 90, 12, 23 };
        sort.insertion(arr3);
        printArr(arr3); //[ 12 22 23 34 56 90 ]

    }

}
