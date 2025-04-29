
// 48.	Demonstrate the use of TreeSet with an example

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);  // Duplicate, will be ignored

        // Displaying elements (sorted order)
        System.out.println("TreeSet elements: " + treeSet);

        // First and last elements
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Removing an element
        treeSet.remove(3);
        System.out.println("After removing 3: " + treeSet);
    }
}
