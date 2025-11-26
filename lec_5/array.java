import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();     //linked list declaration
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        list1.add(50);
         
        list.add(5);
        list.add(10);
        list.add(1,30); //O(n)
        System.out.println(list);
        list.set(1,100); //updating  //O(n)
        System.out.println(list);
        list.addAll(list1);   //adding another list to this list
        list2.add(100);
        list2.add(200);



        // addAll()
        list.addAll(list1);

        // get()
        System.out.println("Element at index 1: " + list.get(1));

        // set()
        list.set(0, 99);

        // remove by index
        list.remove(0);

        // remove by value
        list.remove(Integer.valueOf(0));  // does nothing (0 not present)

        // search operations
        boolean exist = list.contains(30);
        int idx1 = list.indexOf(100);
        int idx2 = list.indexOf(25);

        // size & empty check
        int size = list.size();
        boolean isEmpty = list.isEmpty();

        // a) normal for loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        // b) for-each loop
        for(int num : list){
            System.out.print(num);
        }

        System.out.println(list);

        


    }
}