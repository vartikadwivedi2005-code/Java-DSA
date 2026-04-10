package lect_22;

public class string {
    public static void main(String[] args){
        String str1 = "banana";
        char remove = 'a';
        String result = "";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != remove){
                result += str1.charAt(i);
            }
        }
        System.out.println(result);
    }
}
