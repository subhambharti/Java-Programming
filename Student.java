
// 22.	Create a class to represent a Student with properties like name, 
// roll number, and marks. Write methods to display student details.

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    // Constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating and displaying student objects
        Student student1 = new Student("Alice", 101, 85);
        Student student2 = new Student("Bob", 102, 90);

        student1.display();
        System.out.println();
        student2.display();
    }
}
