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

                // print sum of each subarray
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

    // print subarrays - brute force approach
    public static void printSubArr1(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            // start = k = i
            for (int j = i; j < arr.length; j++) {
                // end = j
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ((arr.length) * (arr.length + 1)) / 2);
    }

    // print maximum subarray sum - brute force approach
    public static void maxSubSum1(int arr[]) {
        int ms = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cs = 0;
                for (int k = i; k <= j; k++) {
                    cs += arr[k];
                    ms = Math.max(cs, ms);
                }
            }
        }

        System.out.println("MSS using brute force app. = " + ms);
    }
    
    // print maximum subarray sum - prefix array
    public static void maxSubSum2(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            // currElemOfPreArr = previousEleOfPreArr + currElemOfArr
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // calculate the max sub arr sum
        int ms = 0;
        for (int i = 0; i < arr.length; i++) {
            // start - i
            for (int j = i; j < arr.length; j++) {
                // end - j
                int cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                ms = Math.max(cs, ms);
            }
        }
        System.out.println("mss using prefix array sum app. = " + ms);
    }
    
    // print maximum subarray sum - kadanes algo. - ignore negative result and make it 0
    public static void maxSubSum3(int arr[]) {
        int ms = 0;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("mss using prefix array sum app. = " + ms);
    }
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 1, -1, 9};
        // printSubArr1(numbers);
        maxSubSum1(numbers);
        maxSubSum2(numbers);
        maxSubSum3(numbers);

    }
}
