import java.util.Stack;

//Stack is based on LIFO concept.
public class StackDemo {
    public static void main(String args[]) {
        Stack<String> users = new Stack<>();
        //Add elements into the stack
        users.push("user1");
        users.push("user2");
        System.out.println(users);

        // Returns the top element of the stack
        System.out.println(users.peek());

        // Returns and removes the element from the end of the stack
        users.pop();
        System.out.println("Stack after Pop = "+ users);
    }
}
