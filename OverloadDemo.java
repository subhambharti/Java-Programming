
// implementing method overloading in java

public class OverloadDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();

        System.out.println(od.add(5, 10));       // Output: 15
        System.out.println(od.add(3.5, 7.2));   // Output: 10.7
    }
}