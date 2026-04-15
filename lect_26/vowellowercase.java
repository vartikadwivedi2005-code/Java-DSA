package lect_26;

public class vowellowercase {
    static String vowel(String str){
        if(str.length() == 0)
            return "";
        char ch = Character.toLowerCase(str.charAt(0));
        return ch + vowel(str.substring(1));
    }
    public static void main(String[] args){
        String str = "HELLO";
        System.out.println(vowel(str));
      
    }
}
