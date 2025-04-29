import java.util.Scanner;

class input
{
    public static void main(String[] arg) {     // psvm short cut key
    Scanner myObj = new Scanner(System.in);    // create a Scanner Object
    System.out.println("Enter your Name : ");   // sysout short cut key
    String name = myObj.nextLine();             // Read user input
    System.out.println("My name is : " + name);   // Output user input
    myObj.close();    // Close the scanner to prevent resource leaks

  }
}
