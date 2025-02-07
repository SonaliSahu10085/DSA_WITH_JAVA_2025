public class Reverse {

    public static void printArr(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArr(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = { 34, 56, 77, 90 };
        printArr(numbers);
        reverseArr(numbers);
        printArr(numbers);
    }
}
