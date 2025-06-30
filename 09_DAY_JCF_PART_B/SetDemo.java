import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]) {
        // HashSet Most optimized with TC O(1)
        // Contains elements in any order
        Set<String> stud = new HashSet<>();

        // LinkedHashSet contains elements in inserted order similar to linkedlist
        // Set<String> stud = new LinkedHashSet<>();

        // TreeSet contains elements in sorted order similar to Binary Search Tree
        // Set<String> stud = new TreeSet<>();

        // Rest of the behaviour is same

        stud.add("ram");
        stud.add("shym");
        System.out.println(stud);

        System.out.println(stud.contains("ram"));

        stud.clear();
        System.out.println(stud);

    }
}
