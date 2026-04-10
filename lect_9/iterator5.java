import java.util.*;
class iterator5{
    public static void main(String[] args){
           ArrayList<Integer> list=new ArrayList<>();
       
    list.add(-1);
    list.add(4);
    list.add(-7);
    list.add(2);
      ListIterator<Integer> it=list.listIterator();
        while(it.hasNext()){
            Integer a=it.next();
            if(a<0){
                int value=a*(-1);
                it.set(value);
            }
           
        }
        System.out.println(list);
    }
}

//replacing the negative numbers with their absolute values