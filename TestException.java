

class myException extends Exception
{
    myException(String message) 
    {
        super(message);
    }
}
class TestException
{
    public static void main(String arg[])
    {
        int x = 5, y = 1000;
        try {
            float z =(float)x /(float)y;
            if (z < 0.01)
                {
                throw new myException("No its too small");
                }
            }
            catch (myException e)
            {
                System.out.println("Caught an Exception");
                System.out.println(e.getMessage());
            }

                finally 
                {
                    System.out.println("I am always here");
                }
    }
}
