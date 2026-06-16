package lect_40;

import java.util.Stack;

public class index {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        // Base score for the outer context
        st.push(0); 
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // Start a new inner context
                st.push(0); 
            } else {
                // Found a ')' -> Calculate score for the current balanced component
                int v = st.pop();
                int count = Math.max(2 * v, 1);
                
                // Add this score to the parent context's score
                st.push(st.pop() + count);
            }
        }
        
        return st.pop();
    }

    public static void main(String args[]) {
        // Example test case: "(()(()))"
        String s = "(()(()))"; 
        
        int result = scoreOfParentheses(s);
        System.out.println("The score of \"" + s + "\" is: " + result);
    }
}