package lect_39;

import java.util.Stack; 

public class BackspaceCompare {
    
    static String build(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        
     
        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String s = "ab#c";
        String t = "ad#c";
        
       
        System.out.println(build(s).equals(build(t))); 
    }
}



/*
 * HOW IT WORKS UNDER THE HOOD:
 * * For both strings "ab#c" and "ad#c", the stack process yields 
 * the exact same final result.
 * * TRACE TABLE:
 * +-----------------+-----------------+-----------------+
 * | Input Character |     Action      |   Stack State   |
 * +-----------------+-----------------+-----------------+
 * |       'a'       |      Push       | ['a']           |
 * |    'b' / 'd'    |      Push       | ['a', 'b']      |
 * |       '#'       | Pop (Backspace) | ['a']           |
 * |       'c'       |      Push       | ['a', 'c']      |
 * +-----------------+-----------------+-----------------+
 * * Since both inputs result in the string "ac", 
 * build(s).equals(build(t)) evaluates to true.
 */