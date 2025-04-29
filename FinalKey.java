
// 29.	Demonstrate the use of final variables, methods, and classes.

class FinalKey {
    public static void main(String[] args) {
 
    final int THRESHOLD = 5;
    final int CAPACITY;       
    final int MINIMUM;
    static final double PI = 3.14; 
    static final double EULERCONSTANT;     
    {
        CAPACITY = 25;
    }

    static {
        EULERCONSTANT = 2.3; 
    }
    
    public FinalKey() {
        MINIMUM = -1; 
    }
}
}