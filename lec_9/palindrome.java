
import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        String str="madam";
        int count = 0;
        for(int i =1 ;i<=str.length()/2;i++)
        {     
            if(str.charAt(i) != str.charAt(str.length()-i))
            {
                count++;
                break;
            }

            if(count == 0)
            {
                System.out.println("Pelindrome");
            }
            else
            {
                System.out.println("Not Pelindrome");
            }
        }
        
       
}
    }
