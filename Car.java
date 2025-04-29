
// Experiment 03 Using Constructor to create Object 

class Car {
    String color;
    String brand;

    Car(String c, String b) { 
        color = c; 
        brand = b;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red", "Ford"); 
        System.out.println("Color: " + myCar.color); 
        System.out.println("Brand: " + myCar.brand); 
    }
}