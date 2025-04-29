// Hierarchical Inheritance

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

// Test2 inherits from Test1
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

// Test3 also inherits from Test1
class Test3 extends Test1 {
    int weight;

    Test3(int x, int y, int w) {
        super(x, y);
        weight = w;
    }

    int density(int volume) {  // Density depends on volume from Test2
        return weight / volume;
    }
}

class HierarchicalInherit {
    public static void main(String[] args) {
        Test2 obj1 = new Test2(10, 20, 30);
        Test3 obj2 = new Test3(10, 20, 6000);

        int area1 = obj1.area();
        int vol = obj1.volume();
        int dens = obj2.density(vol);

        System.out.println("Area : " + area1);
        System.out.println("Volume : " + vol);
        System.out.println("Density : " + dens);
    }
}
