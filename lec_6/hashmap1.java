import java.util.*;
class Main{
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<>();   //key->Integer , value->Integer
        int arr[]={2,2,3,4,2,4,2};
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);   //count frequency of elements   {2=4, 3=1, 4=2}
        }
        System.out.println(map);   //{2=4, 3=1, 4=2}
    }
}