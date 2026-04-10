import java.util.*;
class iterator4{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
       
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    int a= list.size();
    int m=a/2;


        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext() && it.nextIndex()<=m){
            Integer x=it.next();

            System.out.println(x);
           
        }
        while(it.hasPrevious()){
            Integer y=it.previous();
            System.out.println(y);
        }
        System.out.println(list);
    }
}