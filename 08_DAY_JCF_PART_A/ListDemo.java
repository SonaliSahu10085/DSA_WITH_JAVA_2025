import java.util.List;
import java.util.ArrayList;

// List is an Interface in Java. It's a child of Collection Interface. It maintains the insertion order. It can contains dupicate values and null.There are some common implementing classes such as ArrayList, LinkedList, Vector etc. through which we can implement it.

public class ListDemo {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

        list.add(89);
        list.add(67);
        list.add(56);
        list.add(34);
        System.out.println(list);
        
    }
}
