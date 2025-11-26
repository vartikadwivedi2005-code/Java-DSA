import java.util.*;

class Main{
    public static void main(String[] args){
        Linkedlist<Integer> list=new Linkedlist<>();    //CURD - create, update, read, delete
        Linkedlist<Integer> list1=new Linkedlist<>();
        list1.add(50);
        list.add(5);  //O(1)
        list.add(10);
        list.add(1,30); //O(n)

        list.set(1,100); //updating  //O(1)  
        list.addAll(list1);   //adding another list to this list
        list.remove(0); //O(n)
        list.remove(Integer.valueOf(30)); //removing by value  O(n)
        System.out.println(list);

        // get()
        System.out.println("Element at index 1: " + list.get(1));


        //Size and Empty
        int size=list.size();
        boolean isEmpty=list.isEmpty();

        
        
        //Searching
       // boolean exists=list.contains(30);
        //int index1=list.indexOf(30);
        //int index2=list.lastIndexOf(30);

        // set()
       //  list.set(0, 99); //O(n)

        System.out.println(list);
    }
}