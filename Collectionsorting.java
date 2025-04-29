
// 45.	Write a Java program to sort a list of numbers using Collections.

import java.util.*; 

public class Collectionsorting 
{ 
    public static void main(String[] args) 
    { 
        // Create a list of strings 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(20); 
        al.add(10); 
        al.add(40); 
        al.add(30); 
        al.add(50); 

        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 

        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                        " Collection.sort() :\n" + al); 
    } 
} 
