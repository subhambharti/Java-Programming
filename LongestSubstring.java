
// 33.	Write a program to find the longest substring without repeating characters.

import java.util.HashSet;

class LongestSubstring {
    public static int longestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) set.remove(s.charAt(left++));
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}
