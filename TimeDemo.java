// 99.	Write a program to demonstrate the use of java.time package.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm");
        System.out.println("Formatted: " + now.format(formatter));
    }
}
