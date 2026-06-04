// Basics of Stack

package lect_37;
import java.util.Stack;
    
public class stack {
    static void insertbottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top = st.pop();
        insertbottom(st,val);
        st.push(top);
    }
    public static void main(String[] args){
        // Stack<Integer> st = new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // System.out.println(st); // Output: [10, 20, 30]
        // System.out.println("Removed element: " + st.pop()); // Output: Removed element: 30
        // System.out.println(st); // Output: [10, 20]
        // System.out.println("Top element: " + st.peek()); // Output: Top element: 20
        // System.out.println("Is stack empty? " + st.isEmpty()); // Output: Is stack empty? false
        // System.out.println("Stack size: " + st.size()); // Output: Stack size: 2
        // while(!st.isEmpty()){
        //     System.out.println("Popped element: " + st.pop());
        // }
        // Stack<String> st2 = new Stack<>();
        // st2.push("H");
        // st2.push("E");
        // st2.push("L");
        // st2.push("L");
        // st2.push("O"); 
        // while(!st2.isEmpty()){
        //     System.out.println("Popped element: " + st2.pop());
        // }
        // String str = "HELLO";
        // Stack<Character> st3 = new Stack<>();
        // for(char ch : str.toCharArray()){
        //     st3.push(ch);
        // }
        // String rev = "";
        // while(!st3.isEmpty()){
        //     System.out.print(st3.pop());
        // }
        // if(str.equals(rev)){
        //     System.out.println("The string is a palindrome.");
        // } else {
        //     System.out.println("The string is not a palindrome.");
        // }
        // Stack <Integer> st4 = new Stack<>();
        // st4.push(10);
        // st4.push(20);
        // st4.push(30);
        // st4.push(40);
        // st4.push(50);
        // int count = 0;
        // while(!st4.isEmpty()){
        //     st4.pop();
        //     count++;
        // }
        // System.out.println("Number of elements popped: " + count);
        // Stack<Integer> st5 = new Stack<>();
        // st5.push(10);
        // st5.push(20);
        // st5.push(30);
        // st5.push(40);
        // st5.push(50);
        // Stack<Integer> st6 = new Stack<>();
        // // st6.addAll((st5));
        // // System.out.println("Stack 5: " + st5);
        // Stack <Integer> st7 = new Stack<>();
        // st7.push(10);
        // st7.push(20);
        // st7.push(30);
        // st7.push(40);
        // st7.push(50);
        // int key = 30;
        // if(st7.contains(key)){
        //     System.out.println("Found");
        // }
        // else{
        //     System.out.println("Not Found");
        // }
        // Stack <Integer> st =new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // int max = 0;
        // int min = st.peek();
        // while(!st.isEmpty()){
        //     int a = st.pop();
        //     max = Math.max(max,a);
        //     min = Math.min(min,a);

        // }
        // System.out.println(max);
        // System.out.println(min);
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

      
        
    }
}
