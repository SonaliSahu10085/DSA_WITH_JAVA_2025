import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Map<String, Integer> map = new LinkedHashMap<>();
        // Map<String, Integer> map = new TreeMap<>();

        // put() - Add key-value pairs
        map.put("apple", 10);
        map.put("banana", 5);
        map.put("mango", 7);

        // get() - Retrieve value using key
        System.out.println("Value of apple: " + map.get("apple")); // 10

        // containsKey() - Check if a key exists
        System.out.println("Contains key 'banana': " + map.containsKey("banana")); // true

        // containsValue() - Check if a value exists
        System.out.println("Contains value 7: " + map.containsValue(7)); // true

        // remove() - Remove a key-value pair
        map.remove("banana");
        System.out.println("After removing banana: " + map);

        // size() - Number of elements in map
        System.out.println("Size of map: " + map.size());

        // isEmpty() - Check if map is empty
        System.out.println("Is map empty?: " + map.isEmpty());

        // keySet() - Get all keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // values() - Get all values
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // entrySet() - Get all key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // putIfAbsent() - Adds only if key is not present
        map.putIfAbsent("apple", 20); // Won’t update since "apple" is already present
        map.putIfAbsent("orange", 12); // Will add since "orange" is new
        System.out.println("After putIfAbsent: " + map);

        // replace() - Replace value for a specific key
        map.replace("mango", 9);
        System.out.println("After replacing mango: " + map);

        // clear() - Remove all entries
        map.clear();
        System.out.println("After clearing map: " + map);
    }
}

// Output
/*
 * Value of apple: 10
 * Contains key 'banana': true
 * Contains value 7: true
 * After removing banana: {apple=10, mango=7}
 * Size of map: 2
 * Is map empty?: false
 * Keys:
 * apple
 * mango
 * Values:
 * 10
 * 7
 * Entries:
 * apple => 10
 * mango => 7
 * After putIfAbsent: {apple=10, mango=7, orange=12}
 * After replacing mango: {apple=10, mango=9, orange=12}
 * After clearing map: {}
 * 
 */