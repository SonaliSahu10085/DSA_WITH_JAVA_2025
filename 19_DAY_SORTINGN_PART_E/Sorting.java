public class Sorting {

    // Bubble Sort (Iterative) - descending order
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    // Bubble Sort (Recursive)
    void recursiveBubbleSort(int arr[], int i) {
        int n = arr.length;
        if (i >= n - 1) return;

        boolean isSwapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                isSwapped = true;
            }
        }

        if (!isSwapped) return;
        recursiveBubbleSort(arr, i + 1);
    }

    // Selection Sort (Ascending)
    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
    }

    // Recursive Selection Sort
    void recursiveSelectionSort(int arr[], int i) {
        int n = arr.length;
        if (i >= n - 1) return;

        int minIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }

        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        recursiveSelectionSort(arr, i + 1);
    }

    // Insertion Sort
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    // Recursive Insertion Sort
    void recursiveInsertionSort(int arr[], int i) {
        int n = arr.length;
        if (i == n) return;

        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;

        recursiveInsertionSort(arr, i + 1);
    }

    // Merge Sort
    void mergeSort(int arr[]) {
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    void mergeSortHelper(int arr[], int si, int ei) {
        if (si >= ei) return;

        int mid = si + (ei - si) / 2;
        mergeSortHelper(arr, si, mid);
        mergeSortHelper(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= ei) temp[k++] = arr[j++];

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    // Quick Sort
    void quickSort(int arr[], int si, int ei) {
        if (si >= ei) return;
        int pIdx = getPartitionIdx(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int getPartitionIdx(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // place pivot correctly
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    // Utility function to print array
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("]");
    }

    // Main method
    public static void main(String args[]) {
        Sorting s = new Sorting();
        int arr[] = { 34, 12, 45, 67, 12, 9 };


        // s.bubbleSort(arr);
        // s.recursiveBubbleSort(arr, 0);
        // s.selectionSort(arr);
        // s.recursiveSelectionSort(arr, 0);
        // s.insertionSort(arr);
        // s.recursiveInsertionSort(arr, 1);
        // s.mergeSort(arr);
        s.quickSort(arr, 0, arr.length-1);

        printArr(arr);
    }
}
