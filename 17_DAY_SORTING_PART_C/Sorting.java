public class Sorting {
    void merge(int arr[], int si, int midi, int ei) {
    int temp[] = new int[ei - si + 1];
    int l = si;       // Left part
    int r = midi + 1; // Right part
    int t = 0;        // Temp array pointer

    while (l <= midi && r <= ei) {
        if (arr[r] < arr[l]) {
            temp[t++] = arr[r++];
        } else {
            temp[t++] = arr[l++];
        }
    }

    // Copy remaining elements from left
    while (l <= midi) {
        temp[t++] = arr[l++];
    }

    // Copy remaining elements from right
    while (r <= ei) {
        temp[t++] = arr[r++];
    }

    // Copy temp back to original array
    for (int i = 0; i < temp.length; i++) {
        arr[si + i] = temp[i];
    }
}

    void mergeSort(int arr[], int si, int ei) {
        if (si >= ei)
            return;

        int midi = (si + ei) / 2;
        mergeSort(arr, si, midi);
        mergeSort(arr, midi + 1, ei);
        merge(arr, si, midi, ei);
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
        Sorting s = new Sorting();
        int arr[] = { 5, 6, 2, 3, 1, 8 };
        s.mergeSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
