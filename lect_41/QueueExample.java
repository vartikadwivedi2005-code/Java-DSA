package lect_41;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample { 
    public static void main(String[] args) {
  
        Queue<Integer> q1 = new LinkedList<>(); 
        
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        
        System.out.println(q1);       // Outputs: [10, 20, 30, 40, 50]
        System.out.println(q1.remove()); // Removes and outputs: 10
        System.out.println(q1);       // Outputs: [20, 30, 40, 50]
        System.out.println(q1.peek()); //20
        q1.offer(100);  //[20, 30, 40, 50, 100]
        System.out.println(q1);  
        q1.poll();  //[30, 40, 50, 100]
        System.out.println(q1);  
        System.out.println(q1.element());   //30

        for (int x : q1){
            System.out.println(x +"");
        }
        System.out.println(q1.size());
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
        System.out.println(q1.isEmpty());
        
    }
}