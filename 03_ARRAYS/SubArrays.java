import java.util.*;

public class SubArrays {
    public static void printSubArr(int arr[]) {
        int totalSubArr = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // 1st level loop
        for (int i = 0; i < arr.length; i++) {
            // 2nd level loop
            for (int j = i; j < arr.length; j++) {
                // 3rd level loop
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // print subarrays
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                totalSubArr++;
                System.out.println();

                //print sum of each subarray
                System.out.println("Sum = " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }

                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + totalSubArr);
        System.out.println("Max Sum of Subarray = " + maxSum);
        System.out.println("Min Sum of Subarray = " + minSum);


    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 1 };
        printSubArr(numbers);
    }
}
