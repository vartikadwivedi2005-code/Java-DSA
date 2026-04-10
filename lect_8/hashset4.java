import java.util.LinkedHashSet;
class hashset4{
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int arr[]={1,-3,2,5,5};
        int k=4;
        for(int x:arr){
            set.add(x);
        }
        System.out.println(set);
    }
}