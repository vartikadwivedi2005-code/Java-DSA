import java.util.*;   //importing util package to use hashmap.
class Main{
    public static void main(String[] args){
        int arr[]={2,7,5,4};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();   //key->Integer , value
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);  //output - index of two numbers  output - 0 1
                break;
            }
            map.put(arr[i], i);   //put-> insert key-value pair  
        }
    }
}