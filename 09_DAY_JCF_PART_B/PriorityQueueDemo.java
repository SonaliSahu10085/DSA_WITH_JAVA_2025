import java.util.Queue;
// import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueDemo {
    public static void main(String args[]) {
        // By default implements the MIN Heap
        Queue<Integer> pq = new PriorityQueue<>();

        // To implement the MAX Heap, Use Comparator
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(45);
        pq.offer(2);
        pq.offer(11);

        System.out.println(pq); //[2, 45, 11]

        // Returns the head element
        Integer head = pq.peek();
        System.out.println(head);//2

        // Returns and Remove the head element
        System.out.println(pq.poll()); //2
        System.out.println("After removing head element pq = " + pq);//[11, 45]

    }

}