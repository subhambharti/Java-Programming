
// 37.	Write a program to find the frequency of characters in a string.

public class Frequency {

public static void main(String[] args) {
    String str = "This website is awesome.";
    char ch = 'e';
    int frequency = 0;

    for(int i = 0; i < str.length(); i++) {
        if(ch == str.charAt(i)) {
            ++frequency;
        }
    }

    System.out.println("Frequency of " + ch + " = " + frequency);
}
}

