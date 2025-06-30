import java.util.LinkedList;
import java.util.Queue;

//Queue based on the FIFO Concept. Insertion from Rear and Deletion from Front

public class QueueLLDemo {
    public static void main(String args[]) {
        Queue<String> queue = new LinkedList<>();
        // Add element into the queue
        queue.offer("element1");
        queue.offer("element2");

        System.out.println(queue);

        // Returns the head element
        String head = queue.peek();
        System.out.println(head);

        // Returns and Remove the head element
        System.out.println(queue.poll());
        System.out.println("After removing head element queue = " + queue);

    }
}
