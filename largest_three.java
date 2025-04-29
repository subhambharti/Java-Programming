public class largest_three 
{
    int largest(int num1,int num2, int num3)
    {
        if(num1>num2)
        {
            if(num1>num3)
            {
                return(num1);
            }
        }
        if (num2>num3) 
        {
            return(num2);
        } 
        else 
        {
            return num3;
        }
    }
    public static void main(String[] args) 
    {
        largest_three obj=new largest_three();
        System.out.println(obj.largest(19, 2, 3));
    }
}