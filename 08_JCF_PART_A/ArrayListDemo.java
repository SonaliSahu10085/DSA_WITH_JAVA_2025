import java.util.ArrayList;

// ArrayList is a Implementing Class in Java through which we can implement the List and Collection Interface.s

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> firstFiveNumbers = new ArrayList<>();
        firstFiveNumbers.add(1);
        firstFiveNumbers.add(2);
        firstFiveNumbers.add(3);
        firstFiveNumbers.add(4);
        firstFiveNumbers.add(5);

        System.out.println(firstFiveNumbers);

        // To check list is empty or not
        System.out.println(firstFiveNumbers.isEmpty()); // false

        // To check the size of the list
        System.out.println(firstFiveNumbers.size()); // false

        // To get an element of the list
        System.out.println(firstFiveNumbers.get(0));

        // To modify an element of the list
        System.out.println(firstFiveNumbers.set(0, 1000));

        System.out.println(firstFiveNumbers);

        // Different 3 ways to Iterate Over List
        // 1. Using basic for loop
        for (int i = 0; i < firstFiveNumbers.size(); i++) {
            System.out.println(firstFiveNumbers.get(i));
        }

        // 2. Using enhance for loop
        for (int number : firstFiveNumbers) {
            System.out.println(number);
        }

        // 3. Using for each loop with lamda expression
        firstFiveNumbers.forEach((number) -> {
            System.out.println(number);
        });

    }

}
