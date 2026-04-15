package lect_25;

public class oddsum {
    static int oddsum1(int[] arr , int i){
        if(i == arr.length)
            return 0;
        int val = (arr[i]%2==0) ? arr[i] : 0;
        return val + oddsum1(arr,i+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int i = 0;
        System.out.println(oddsum1(arr,i));
    }
}
