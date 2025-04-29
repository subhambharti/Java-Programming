
// 83.	Write a Java program to implement a linked list.

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10); list.add(20); list.add(30);
        list.display();
    }
}
