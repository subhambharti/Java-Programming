
// jump statement 
class BcJump
{
    public static void main(String[] args) 
    {
        loop1: for (int i = 1; i < 100; i++)
        {
            // System.out.println(" ");
            if( i >= 10)
                break;

            for ( int j = 1; j < 100; j++)
            {
                System.out.print("*");
                if (j==i)
                break;
            }
                System.out.println();
        }
        
        System.out.println("Termination of Break");  
    }
}