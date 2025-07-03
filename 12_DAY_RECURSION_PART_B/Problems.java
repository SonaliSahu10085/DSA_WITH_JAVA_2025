import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reference for the problems: https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2

public class Problems {
    // 6 six() - Reverse an array
    // TypeA() - One pointer approach
    void sixTypeA(int[] arr, int ptr, int n) {
        if (ptr >= n / 2)
            return;

        // swapping logic
        int temp = arr[ptr];
        arr[ptr] = arr[n - ptr - 1];
        arr[n - ptr - 1] = temp;

        sixTypeA(arr, ptr + 1, n);
    }

    // TypeB() - Two pointers approach
    void sixTypeB(int[] arr, int l, int r) {
        if (l >= r)
            return;

        // swapping logic
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        sixTypeB(arr, l + 1, r - 1);
    }

    // seven() - Check a string is palindrome or not!
    Boolean sevenTypeA(String str, int l, int r) {
        if (l >= r)
            return true;

        if (str.charAt(l) != str.charAt(r))
            return false;

        return sevenTypeA(str, l + 1, r - 1);
    }

    Boolean sevenTypeB(String str, int i) {
        if (i >= str.length() / 2)
            return true;

        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;

        return sevenTypeB(str, i + 1);
    }

    // eight() - Get nth Fibonacci Number
    // TC - nearly O(2^n) as it follows bi-directional recursive approach
    int eight(int n) {
        if (n <= 1)
            return n;

        int last = eight(n - 1);
        int sLast = eight(n - 2);

        return last + sLast;
    }

    // printArr() - For printing array
    public static void printArr(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    // inputN() - For taking the value of N
    public static int inputN() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter N = ");
        int n = Integer.parseInt(br.readLine());
        return n;
    }

    public static void main(String args[]) {
        try {
            Problems pb = new Problems();
            
            // 6.
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
            printArr(arr);
            pb.sixTypeA(arr, 0, arr.length);
            printArr(arr);
            pb.sixTypeB(arr, 0, arr.length - 1);
            printArr(arr);

            // 7. 
            String str = "MOM";
            System.out.println(pb.sevenTypeA(str, 0, str.length() - 1));
            System.out.println(pb.sevenTypeB(str, 0));

            // 8.
            System.out.println(pb.eight(inputN()));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
