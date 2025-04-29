
// 42.	Create a program to implement a stack using the Stack class.

// Java Program Implementing Stack Class
import java.util.Stack;

public class stack
{
    public static void main(String[] args) 
    {
        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        // Pop elements from the stack
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
