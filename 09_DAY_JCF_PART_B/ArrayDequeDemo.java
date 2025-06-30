import java.util.ArrayDeque;

class ArrayDequeDemo {
    public static void main(String args[]) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(45);
        adq.offerFirst(2);
        adq.offerLast(11);

        System.out.println(adq); // [2, 45, 11]

        // Returns the head element
        Integer head = adq.peek();
        // adq.peekFirst();
        // adq.peekLast();
        System.out.println(head);// 2

        // Returns and Remove the head element
        System.out.println(adq.poll()); // 2
        // pollFirst, pollLast
        System.out.println("After removing head element adq = " + adq);// [45, 11]

    }

}