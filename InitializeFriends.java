
// initialize Object

class InitializeStudent
{
    int id;
    String name;
}
class TestStudent
{
    public static void main(String[] args) 
    {
        InitializeStudent s1 = new InitializeStudent();     // Object Call
        s1.id = 1001;
        s1.name = "Subham";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
// class friend 
// {
//     int id;
//     String name;
// }
//     class InitializeFriends
//     {
//         public static void main(String[] args) {
//             friend s1 = new friend();
//             s1.id = 1002;
//             s1.name = "Avinash";
//             System.out.println(s1.id);
//             System.out.println(s1.name);
//         }
//     }