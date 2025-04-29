// Multilevel Inheritance

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

class Test3 extends Test2 {
    int weight;

    Test3(int x, int y, int z, int w) {
        super(x, y, z);
        weight = w;
    }

    int density() {
        return weight / volume(); 
    }
}

class MultiLevelinherit {
    public static void main(String[] args) {
        Test3 obj = new Test3(10, 20, 30, 6000);
        int area1 = obj.area();
        int vol = obj.volume();
        int dens = obj.density();
        
        System.out.println("Area : " + area1);
        System.out.println("Volume : " + vol);
        System.out.println("Density : " + dens);
    }
}

