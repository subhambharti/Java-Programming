// 100.	Create a program to generate random numbers and sort them.

import java.util.*;

public class RandomSortDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numbers.add(rand.nextInt(100));

        System.out.println("Before sort: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);
    }
}
