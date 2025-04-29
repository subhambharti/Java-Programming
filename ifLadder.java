class ifLadder
{
    public static void main(String arg[])
    {
        int marks = 90;
        if ( marks >= 80 )
        {
            System.err.println("Exclent");
        }
        else if ( marks >= 60 && marks < 80 )
        {
            System.err.println("1st Division");
        }
        else if ( marks >= 45 && marks < 60 )
        {
            System.err.println("2nd Division");
        }
        else 
        {
            System.err.println("Fail");
        }
    }
}