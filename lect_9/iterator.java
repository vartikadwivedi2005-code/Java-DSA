
import java.util.*;

class IteratorDemo{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
           if(it.next()==6){
               it.remove();
            }
        }
        System.out.println(list);
    }
}