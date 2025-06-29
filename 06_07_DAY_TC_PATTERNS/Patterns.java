import java.io.*;

//Pattern Questions Link : https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

//We can use either 0 or 1 based indexing.

class Patterns {

    // Pattern 1, TC = O(n^2) , SC = 1
    public static void patternOne(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2, TC = O(n^2) , SC = 1
    public static void patternTwo(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3, TC = O(n^2), SC = 1
    public static void patternThree(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4, TC = O(n^2), SC = 1
    public static void patternFour(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 5, TC = O(n^2), SC = 1
    public static void patternFive(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < (n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 6, TC = O(n^2), SC = 1
    public static void patternSix(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner loop
            for (int j = 0; j < (n - i); j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    // Pattern 7, TC = O(n^2), SC = 1
    public static void patternSeven(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner1 loop
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }
            // inner2 loop
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Pattern 8, TC = O(n^2), SC = 1
    public static void patternEight(int n) {
        // outer loop
        for (int i = 0; i < n; i++) {
            // inner1 loop
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // inner2 loop
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 9, TC = O(n^2), SC = 1
    public static void patternNine(int n) {
        // Combination of two patterns
        patternSeven(n);
        patternEight(n);
    }

    // Pattern 10, TC = O(n^2), SC = 1
    public static void patternTen(int n) {
        for (int i = 1; i < (2 * n); i++) {
            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // Pattern 11, TC = O(n^2), SC = 1
    public static void patternEleven(int n) {
        int start;
        for (int i = 0; i < n; i++) {
            start = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // Pattern 12, TC = O(n^2), SC = 1
    public static void patternTwelve(int n) {
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            // print digits
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // print digits
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            space -= 2;
        }
    }

    // Pattern 13, TC = O(n^2), SC = 1
    public static void patternThirteen(int n) {
        int digit = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }

    // Pattern 14, TC = O(n^2), SC = 1
    public static void patternFourteen(int n) {
        for (int i = 1; i <= n; i++) {
            // ASCII Concept
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Pattern 15, TC = O(n^2), SC = 1
    public static void patternFifteen(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Pattern 16, TC = O(n^2), SC = 1
    public static void patternSixteen(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }

    // Pattern 17, TC = O(n^2), SC = 1
    public static void patternSeventeen(int n) {
        for (int i = 0; i < n; i++) {
            // inner1 loop
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("  ");
            }
            // inner2 loop
            char ch = 'A';
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print(ch + " ");
                if (j < (2 * i + 1) / 2)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }

    // Pattern 18,TC = O(n^2), SC = 1

    public static void patternEighteen(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // Pattern 19, TC = O(n^2), SC = 1
    public static void patternNineteen(int n) {
        // First part
        int space = 0;
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // print space
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space += 2;
        }

        // Second Part
        space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // print space
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space -= 2;
        }
    }

    // Pattern 20, TC = O(n^2), SC = 1
    public static void patternTwenty(int n) {
        // First Part
        int space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // print space
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space -= 2;
        }

        // Second Part
        space = 2;
        for (int i = 0; i < n - 1; i++) {
            // print stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("* ");
            }

            // print space
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
            space += 2;
        }
    }

    // Pattern 21, TC = O(n^2), SC = 1
    public static void patternTwentyOne(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else if (i % 2 != 0 && (j == 1 || j == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Pattern 22, TC = O(n^2), SC = 1
    public static void patternTwentyTwo(int n) {
        //Doubt
        ///
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // No. of TestCases
        int t = Integer.parseInt(br.readLine());

        // Testing TestCases
        for (int i = 1; i <= t; i++) {
            // No. of Rows for Pattern
            int n = Integer.parseInt(br.readLine());

            // PatternMethods Execution
            // patternOne(n);
            // patternTwo(n);
            // patternThree(n);
            // patternFour(n);/--
            // patternFive(n);
            // patternSix(n);
            // patternSeven(n);
            // patternEight(n);
            // patternNine(n);
            // patternTen(n);
            // patternEleven(n);
            // patternTwelve(n);
            // patternThirteen(n);
            // patternFourteen(n);
            // patternFifteen(n);
            // patternSixteen(n);
            // patternSeventeen(n);
            // patternEighteen(n);
            // patternNineteen(n);
            // patternTwenty(n);
            // patternTwentyOne(n);
            // patternTwentyTwo(n);

        }

    }
}