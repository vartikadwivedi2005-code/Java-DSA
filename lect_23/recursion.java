// At its simplest, recursion is a programming and mathematical technique where a function calls itself to solve a problem. Think of it like a set of Russian Nesting Dolls: to get to the tiny doll in the center, you have to keep opening a slightly larger doll that looks exactly like it.

// How Recursion Works
// For a recursive function to be successful (and not run forever until your computer crashes), it needs two essential components:

// 1):The Base Case: The "stop" signal. This is the simplest possible version of the problem that can be solved immediately without further recursion.

// 2):The Recursive Step: The part where the function calls itself, but with a smaller or simpler version of the original input, moving closer to the base case.
package lect_23;

public class recursion {
    static void printnumber(int n){
        if(n>5){
            return ;
        }
        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[] args){
        printnumber(1);
    }
}
