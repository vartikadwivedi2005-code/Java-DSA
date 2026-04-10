import java.util.ArrayList;   //importing only ArrayList class from util package
class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();    //CURD - create, update, read, delete
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>(10); //initial capacity
        list1.add(50);
        list.add(5);  //O(1)
        list.add(10);
        list.add(1,30); //O(n)
        list2.add(100);
        list2.add(200);

        //int first=list.get(0); //O(1)
        //int last=list.get(list.size()-1); //O(1)     [5, 30, 10],30

        
       // list.set(1,100); //updating  //O(1)  [5, 100, 10],100

        //list.addAll(list1);   //adding another list to this list
        //list.addAll(list2);   // [5, 30, 10, 50, 100, 200],30

       // list.remove(0); //O(n)
        //list.remove(Integer.valueOf(30)); //removing by value  O(n)   [10],10

       // boolean exists=list.contains(30); //O(n)
       // int idx1=list.indexOf(30); //O(n)
       // int idx2=list.lastIndexOf(30); //O(n)   [5, 30, 10],30

       int size=list.size(); //O(1)
       boolean isEmpty=list.isEmpty(); //O(1)




        System.out.println(list);
        System.out.println(list.get(1)); //O(1)
    }
}
