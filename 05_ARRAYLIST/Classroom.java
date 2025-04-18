import java.util.*;

public class Classroom {

    public static ArrayList<Integer> swap(int idx1, int idx2, ArrayList<Integer> list) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        return list;
    }

    public static void main(String args[]) {
        // ArrayList<String> list = new ArrayList<>();

        //     // Add element - O(1)
        //     list.add("flower");
        //     list.add("fruits");
        //     list.add("utensils");
        //     System.out.println("list : " + list);

        //     // Get element - O(1)
        //     String item = list.get(1);
        //     System.out.println(item);

        //     // Remove element - O(n)
        //     System.out.println(list.remove(0));
        //     System.out.println("list : " + list);

        //     // Contains - search - O(n)
        //     System.out.println(list.contains("fruits"));
        //     System.out.println(list.contains("flower"));

        //     // Set - O(n)
        //     System.out.println(list.set(0, "flower"));
        //     System.out.println("list : " + list);

        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        ArrayList<Integer> list = new ArrayList<>();

        // Add new element - O(1)
        // syntax .add(element)
        list.add(1);
        list.add(2);
        list.add(67);
        list.add(65);
        list.add(4);

        System.out.println(list); //[1, 2, 3, 4]

        // Another syntax of add 
        // to add in a particular index - O(n)
        // list.add(1, 100);
        // System.out.println(list);

        // Also we have
        // list.addFirst(78);
        // list.addLast(90);
        // System.out.println(list);

        // Get an element - O(1)
        // syntax .get(index)
        // System.out.println(list.get(2)); //3

        // Remove an element - O(n)
        // syntax .remove(index)
        // System.out.println(list.remove(1));
        // System.out.println(list.removeFirst());
        // System.out.println(list.removeLast());

        // Set an element - O(n)
        // syntax .set(index, element)
        // System.out.println(list.set(1, 54)); 
        //returns the element of that index and set new value to it
        // System.out.println(list); 

        // Checks elemnts exists or not - O(n)
        // syntax .contains(element)
        // System.out.println(list.contains(8));
        // System.out.println(list.contains(4));
        //returns true or false 

        // print reverse of an arraylist - O(n)
        // for (int i = list.size() - 1; i >= 0; i--) {
        //     System.out.print(list.get(i) + " ");
        //     // 4 3 2 1
        // }

        // findout the maximum element of an arraylist - O(n)
        // int maxE = list.get(0);
        // for (int i = 0; i < list.size(); i++) {
        //     if (maxE < list.get(i)) {
        //         maxE = list.get(i);
        //         maxE = Math.max(maxE, list.get(i));
        //     }
        // }
        // System.out.println(maxE);

        // swap two numbers in an arraylist - O(n)
        // idx = 1, idx = 3
        // System.out.println(swap(1, 3, list));

        
    }

}
