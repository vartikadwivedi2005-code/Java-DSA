package lect_41;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
       
        Queue<Character> q = new LinkedList<>();
        q.add('A');
        q.add('B');
        q.add('C');
        q.add('D');
        q.add('E');

        int k = 3; 

        System.out.println("Initial Queue: " + q);
        System.out.println("-------------------------");

       
        while (q.size() > 1) {
            
            for (int i = 0; i < k - 1; i++) {
                char skipped = q.poll();
                q.add(skipped);
            }
            
            
            char eliminated = q.poll();
            System.out.println("Eliminated: " + eliminated + " -> Remaining: " + q);
        }

       
        System.out.println("-------------------------");
        System.out.println("Winner is: " + q.peek());
    }
}


// A B C D E 

// B C D E A 
// C D E A B
// D E A B 

// E A B D
// A B D E 
// B D E 

// D E B 
// E B D
// B D

// D B
// B D
// D
