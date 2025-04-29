
// 24.	Demonstrate method overriding with an example

class A1{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B2 extends A1{

}
public class Overriding{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
