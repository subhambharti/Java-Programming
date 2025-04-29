
// 27.	Create a program to demonstrate the use of this and super keywords.


class RR {
    int a = 10;
    static int b = 20;

    void GFG()
    {
        this.a = 100;

        System.out.println(a);
        
        this.b = 600;
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        new RR().GFG();
    }
}
