//Dutch National Flag Algorithm
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects
//  of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

import java.util.*;
class SortingDemo2{
   public static void main(String[] args){
    int arr[]={2,0,1,2};
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
