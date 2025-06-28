import java.util.*;

public class MultiDimensionalAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // brute force approach - O(n2)
        // for (int i = 1; i <= 3; i++) {
        //     ArrayList<Integer> list = new ArrayList<>();
        //     for (int j = 1; j <= 5; j++) {
        //         list.add(i * j);
        //     }

        //     mainList.add(list);
        // }

        // System.out.println(mainList);

        // Little optimize approach - O(n)
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(1 * i);
            list2.add(2 * i);
            list3.add(3 * i);
        }
        
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);


        // Traversing into MDAL
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
