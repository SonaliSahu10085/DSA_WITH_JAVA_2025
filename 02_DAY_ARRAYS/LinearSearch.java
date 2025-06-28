
public class LinearSearch {

    public static int linearSearch(int numbers[], int sv) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == sv) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 3, 4, 22, 5, 2 };
        int searchValue = 99;
        if (linearSearch(numbers, searchValue) != -1) {
            System.out.println("Search Value is at : " + linearSearch(numbers, searchValue) + " index.");
        } else {
            System.out.println("Value Not Found.");
        }
    }
}
