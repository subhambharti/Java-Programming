
// 47.	Write a program to remove duplicates from a list using a Set

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6);
        
        Set<Integer> set = new HashSet<>(list); // Removes duplicates
        List<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates: \n" + uniqueList);
    }
}
