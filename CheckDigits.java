// Java program to check if a string 
// contains only digits using Character.isDigit()

public class CheckDigits {
  
    public static boolean onlyDigits(String s) {
      
        for (int i = 0; i < s.length(); i++) {
          
            if (!Character.isDigit(s.charAt(i)))
             {
                return false;
             }
        }
        return true; 
    }

    public static void main(String[] args) {
      
        System.out.println(onlyDigits("1234"));       
        System.out.println(onlyDigits("123s"));       
    }
}
