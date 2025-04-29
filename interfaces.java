
// Interface Program : java provide an alternative approach known as interface
//                      to suport the concept of multiple inheritance.

interface Area
{
    final static float pi = 3.14f;
    float compute (float x, float y);
}
class Rectangle implements Area
{
    public float compute ( float x, float y)
    {
        return ( x * y );
    }
}
class circle implements Area
{
    public float compute ( float x , float y)
    {
        return ( pi * x * y );
    }
}
class interfaces
{
    public static void main(String args [])
    {
        Area  obj;
        Rectangle rect = new Rectangle();
        circle cir = new circle();
        obj = rect;
        System.out.println("Rectangle  = " + obj.compute(10.6f, 20.7f));
    }
}