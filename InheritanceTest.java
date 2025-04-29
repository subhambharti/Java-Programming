// Single Inheritance

class Test1 {
    int l, b;

    Test1(int x, int y) { 
        l = x;
        b = y;
    }

    int area() {
        return l * b;
    }
}

class Test2 extends Test1 {
    int h;

    Test2(int x, int y, int z) {
        super(x, y); 
        h = z;
    }

    int volume() {
        return l * b * h; 
    }
}

class InheritanceTest {
    public static void main(String[] args) {
        Test2 obj = new Test2(10, 20, 30);
        int area1 = obj.area();
        int vol = obj.volume();
        System.out.println("Area : " + area1);  
        System.out.println("Volume : " + vol);  
    }
}
