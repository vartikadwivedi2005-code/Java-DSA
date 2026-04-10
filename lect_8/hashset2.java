import java.util.HashSet;
class hashset2{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        int arr[]={1,2,3,4,5};
        int arr1[]={4,5,6,7,8};
        //intersection of two arrays using hashset
        for(int x:arr){
            set.add(x);
        }
        System.out.println("Intersection elements are:");
        for(int y:arr1){
            if(set.contains(y)){
                System.out.println(y);
            }
        }
        System.out.println(set); 

    }
}