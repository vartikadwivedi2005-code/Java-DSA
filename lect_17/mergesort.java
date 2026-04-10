import java.util.*;
class MergeSortTempArrayList{
    static void mergeSort(Integer arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        }
        public static void main(String args[]){
        Integer arr[]={38,27,43,3,9,82,10};
        int n=arr.length;
        mergeSort(arr,0,n-1);
        System.out.println("Sorted array: "+Arrays.toString(arr));

    }
}

