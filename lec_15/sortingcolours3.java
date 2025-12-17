import java.util.*;
class Sortingcolours3{
   public static void main(String[] args){
    int arr[]={2,0,2,1,1,0};
    int low=0;
    int mid=0;
    int h=arr.length-1;
    System.out.println("Original array: " + Arrays.toString(arr));
   while(mid<=h){
    if(arr[mid]==0){
       swap(arr,low,mid);
       low++;
       mid++;
    }
    else if(arr[mid]==1){
        mid++;
    }
    else{
        swap(arr,mid,h);  
        h--;
      }
      
   }
   System.out.println("Sorted array: " + Arrays.toString(arr));
 }
     private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

 
   
}