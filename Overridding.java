class Overridding 
{
    void show (int a) 
    {
        System.out.println("int method");
    }
    void show (int... a)
    {
        System.out.println("var args method");
    }
        public static void main(String[] args)
        {
            Overridding t=new Overridding();
            t.show();
        }
    
}