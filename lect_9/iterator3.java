import java.util.*;
class iterator3{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
             System.out.println(it.next());
            int x=0;
            if(x % 2 == 0){
                it.set(-1);
            }
        }
        System.out.println(list);
        
    }
}