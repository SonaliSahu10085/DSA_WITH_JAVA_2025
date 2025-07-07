class Sorting {

    // Recursive Approach
    int[] bubble(int arr[], int n) {
        if (n == 1)
            return arr;

        boolean isSwapped = false;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                isSwapped = true;
            }
        }

        if (!isSwapped)
            return arr;

        return bubble(arr, n - 1);
    }

    // Recursive Approach
    int[] insertion(int arr[], int i) {
        // Base Condition
        if (i >= arr.length)
            return arr;

        int key = arr[i];
        int j = i - 1;
        boolean isRightShift = false;

        while (j >= 0 && arr[j] > key) {
            // Shifting the element to the right
            arr[j + 1] = arr[j];
            j--;
            isRightShift = true;
            System.out.println("run");
        }
        arr[j + 1] = key;

        // If array is already sorted return it
        if (!isRightShift)
            return arr;

        return insertion(arr, i + 1);
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

        int arr[] = { 89, 2, 43, 4, 25 };

        // int result[] = sort.bubble(arr, arr.length);

        int result[] = sort.insertion(arr, 1);
        printArr(result);

    }
}