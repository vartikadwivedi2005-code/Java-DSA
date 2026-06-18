package lect_41;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryQueue {
    public static void main(String args[]) {
        int n = 10; 
        printBinary(n);
    }

    public static void printBinary(int n) {
       
        Queue<String> q = new LinkedList<>();

      
        q.add("1");

        
        for (int i = 0; i < n; i++) {
            
            String current = q.remove();
            System.out.println(current);

            
            q.add(current + "0");
            q.add(current + "1");
        }
    }
}


