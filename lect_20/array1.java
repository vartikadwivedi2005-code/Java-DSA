package lect_20;

public class array1 {
    public static void main(String[] args){
        int arr[] = {3,20,7,15,6,8,5,2};
        int n=arr.length;
        int [] arr1 = new int[n];
        int p=0;
        int cmax=arr[n-1];
        arr1[p++]=cmax;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>cmax){
                cmax=arr[i];
                arr1[p++]=cmax;
            }
        }
        for(int i=p-1;i>=0;i--){
            System.out.print(arr1[i]+" ");
        }

    }
}
