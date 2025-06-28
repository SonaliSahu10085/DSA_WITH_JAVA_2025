public class SearchElement {

    // Linear Search - 2D Array
    public static String searchElement(int matrix[][], int key) { // tc - O(n^2)
        // outer - row
        for (int i = 0; i < matrix.length; i++) {
            // inner - col
            for (int j = 0; j < matrix[0].length; j++) {
                // search - logic
                if (matrix[i][j] == key) {
                    return "(" + i + ", " + j + ")";
                }
            }
        }
        return "(-1, -1)";
    }

    // Search Largest element - 2D Array
    public static int maxFinder(int matrix[][]) {
        int max = matrix[0][0];

        // outer loop
        for (int i = 0; i < matrix.length; i++) {
            // inner loop
            for (int j = 0; j < matrix[0].length; j++) {

                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Search Smallest element - 2D Array
    public static int minFinder(int matrix[][]) {
        int min = matrix[0][0];

        // outer - row traverse
        for (int i = 0; i < matrix.length; i++) {
            // inner - col traverse
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Calculate diagonals sum - 2D Array
    // primary dg (row == col) + secondarydg (row + col == row length - 1)

    public static int dgSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) { //tc - O(n)
            
            // sum - pd
            sum += matrix[i][i];

            // sum - sd (i+j = n-1)
            if (i != n - 1 - i) {
                sum += matrix[i][n-1-i];
            }
        }

        return sum;
    }



    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 98, 7, 8 }, { 9, 10, 11, 12 }, { 13, 0, 15, 16 } };
        int key = 11;
        // System.out.println(searchElement(matrix, key));
        // System.out.println(maxFinder(matrix));
        // System.out.println(minFinder(matrix));
        System.out.println(dgSum(matrix));
    }
}
