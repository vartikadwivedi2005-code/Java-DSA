import java.util.HashSet;
class hashset1 {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        int arr[]={1,2,3,1};       //check duplicates in an array using hashset
        for(int x:arr){
            if(set.contains(x)){
                System.out.println("Duplicate found:" +x);   //print duplicate element
            }
            else 
            {
                set.add(x);
            }
        }
        
        System.out.println(set);
  }
}