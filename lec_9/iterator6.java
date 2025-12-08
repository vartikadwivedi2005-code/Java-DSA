import java.util.*;
class iterator6{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
       
    list.add(55);
    list.add(4);
    list.add(10);
    list.add(25);
    list.add(60);
    list.add(43);
      ListIterator<Integer> it=list.listIterator();
      int target = 25;


        while(it.hasNext()){
            Integer a=it.next();
            if(a==target){
                break;
            }
           
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            if(y < target){
                it.remove();
            }
        }
        System.out.println(list);
    }
}

// to reach the target value and then removing the values less than that target value while 
//returning back 