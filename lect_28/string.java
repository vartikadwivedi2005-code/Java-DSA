package lect_28;

public class string {
    static int count(String up){
        if(up.isEmpty()){    // base case
            return 1;
        }
        char ch = up.charAt(0);    // first character
        return count(up.substring(1)) + count(up.substring(1));
    }
    public static void main(String[] args){
            String up = "abc";
            System.out.println(count(up));

    }
}

// string subsequence count