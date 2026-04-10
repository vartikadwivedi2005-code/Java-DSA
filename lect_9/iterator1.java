import java.util.*;
class Iterator1{
    public static void main(String[] main){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it=list.listIterator();
         while(it.hasNext()){
            System.out.println(it.next());
           // if(it.next()==6){
           //    it.remove();
           // }
        }
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(list);

    }
}