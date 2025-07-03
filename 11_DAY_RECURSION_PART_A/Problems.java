import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Reference for the problems: https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2

public class Problems {
    // 1. one() - Print name N times using recursion
    void one(int i, int n) {
        // Base Condition
        if (i > n)
            return;

        System.out.println("Sonali Sahu");
        one(i + 1, n);
    }

    // 2. two() - Print 1 to N using recursion
    void two(int i, int n) {
        if (i > n)
            return;

        System.out.println(i);
        two(i + 1, n);
    }

    // 3. three() - Print N to 1 using recursion
    void three(int i, int n) {
        if (i < 1)
            return;
        System.out.println(i);
        three(i - 1, n);
    }

    // 2' twoBacktracking() - Print 1 to N using recursion with Backtracking
    void twoBacktracking(int i, int n) {
        if (i < 1)
            return;

        twoBacktracking(i - 1, n);
        System.out.println(i);
    }

    // 3' threeBacktracking() - Print N to 1 using recursion with Backtracking
    void threeBacktracking(int i, int n) {
        if (i > n)
            return;

        threeBacktracking(i + 1, n);
        System.out.println(i);
    }

    // 4 four() - Print Sum of first N numbers using recursion
    int fourTypeA(int i, int n, int sum) {
        if (i > n)
            return sum;

        return fourTypeA(i + 1, n, sum + i);
    }

    int fourTypeB(int n) {
        if (n == 0)
            return 0;

        return n + fourTypeB(n - 1);
    }

    // 5 five() - Print Factorial of N numbers using recursion
    int fiveTypeA(int i, int n, int fact) {
        if (i > n)
            return fact;

        return fiveTypeA(i + 1, n, fact * i);
    }

    int fiveTypeB(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fiveTypeB(n - 1);
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
            // int n = inputN();
            // pb.one(1, n);
            // pb.two(1, n);
            // pb.three(n, n);
            // pb.twoBacktracking(n, n);
            // pb.threeBacktracking(1, n);
            // System.out.println("Sum through type A= " + pb.fourTypeA(1, n, 0));
            // System.out.println("Sum through type B= " + pb.fourTypeB(n));
            // System.out.println("Fact through type A= " + pb.fiveTypeA(1, n, 1));
            // System.out.println("Fact through type B= " + pb.fiveTypeB(n));

            // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
            // printArr(arr);
            // pb.sixTypeA(arr, 0, arr.length);
            // printArr(arr);
            // pb.sixTypeB(arr, 0, arr.length - 1);
            // printArr(arr);

            // String str = "MOM";
            // System.out.println(pb.sevenTypeA(str, 0, str.length() - 1));
            // System.out.println(pb.sevenTypeB(str, 0));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
