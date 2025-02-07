public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int low = 0, high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 12, 13, 14, 15, 67, 78, 90, 123 };
        int key = 900;
        System.out.println(binarySearch(numbers, key));
    }
}
