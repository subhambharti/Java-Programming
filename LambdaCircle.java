// 91.	Write a program to calculate the area of a circle using a lambda expression.

interface CircleArea {
    double calculate(double radius);
}

public class LambdaCircle {
    public static void main(String[] args) {
        CircleArea area = r -> Math.PI * r * r;
        System.out.println("Area: " + area.calculate(5));
    }
}
