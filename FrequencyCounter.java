
// 46. Create a program to find the frequency of elements in an ArrayList

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
