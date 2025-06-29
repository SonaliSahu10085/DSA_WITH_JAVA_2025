import java.util.ArrayList;
import java.util.Collection;

// Collection in Java is a root interface. There are some common implementing classes such as ArrayList, LinkedList, Vector etc. through which we can implement it.

public class CollectionDemo {
    public static void main(String args[]) {
        Collection<String> collection = new ArrayList<>();
        collection.add("element 1");
        collection.add("element 2");
        collection.add("element 3");
        collection.add("element 3");
        collection.add("element 3");
        collection.add(null);

        System.out.println(collection);

    }
}
