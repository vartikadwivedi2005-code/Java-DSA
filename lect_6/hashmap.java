//hashmap - hashmap is a data structure that stores data in key-value pairs.
import java.util.*;   //importing util package to use hashmap.
class Main{
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<>();   //key->Integer , value->Integer
        map.put(1,100);    //put-> insert key-value pair
        map.put(2,200);    //put-> insert key-value pair
        System.out.println(map);   //{1=100, 2=200}
        System.out.println(map.get(1));   //100  get-> get value of key
        System.out.println(map.getOrDefault(3,0));     //0  getorDefault-> if key is not present 
        // return default value
        for(int x:map.keySet()){   //1 2
            System.out.println(map.get(x));   //100 200
        }
        
    }
}