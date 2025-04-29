
// Initialize Object by Reference Variable

class Student
{
    int id;
    String name;
}
class MCAStudent
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.id = 1001;
        s1.name = "\nSubham";
        System.out.print(s1.id);
        System.out.print(s1.name);
    }
}

/*
class friend
{
    int id;
    String name;
}
class HelloFriends
{
    public static void main(String arg[])
    {
        friend s1 = new friend();
        s1.id = 1001;
        s1.name = "Kuch v";
        System.out.print(s1.id);
        System.out.println(s1.name);
    }
}
    */