import java.util.*;
class ArrayDemo1{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
       

        List<Integer> result=list.stream().filter(n->n>2).toList();
        List<Integer> mapRes=list.stream().map(n->n%2).toList();
        int data =list.stream().reduce(0,(a,b)->a+b);
        
        System.out.println(result);
        System.out.println(mapRes);
        System.out.println(data);
    

    }
}