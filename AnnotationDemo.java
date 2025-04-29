// 96.	Create a program to demonstrate the use of annotations.

@interface MyAnnotation {
    String value();
}

class AnnotatedClass {
    @MyAnnotation(value = "Hello")
    public void show() {
        System.out.println("Method with annotation");
    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotatedClass obj = new AnnotatedClass();
        obj.show();
    }
}
