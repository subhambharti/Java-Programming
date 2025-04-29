

class Student
{
    int id;
    String name;
}
    class TestStudent
    {
        public static void main(String[] args) 
        {
            Student s1 = new Student();
            s1.id = 68;
            s1.name = " Subham";
            System.out.println(s1.id);
            System.out.println(s1.name);    
        }
    }

    class friend
    {
        int id;
        String name;
    }
    class helloFriends
    {
        public static void main(String[] args) 
        {
            friend s2 = new friend();
            s2.id = 001;
            s2.name = "Amit";
            System.out.println(s2.id); 
            System.out.println(s2.name);   
        }
    }