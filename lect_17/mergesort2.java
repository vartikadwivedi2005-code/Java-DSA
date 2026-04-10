import java.util.ArrayList;
import java.util.Arrays;

class MergeSortTempArrayList1 {
    static void mergeSort(Integer arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            
            
            merge(arr, l, mid, r);
        }
    }
    
    static void merge(Integer arr[], int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = mid + 1;
        
        
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        
        
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        
        
        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }
        
        
        for (int k = 0; k < temp.size(); k++) {
            arr[l + k] = temp.get(k);
        }
    }
    
    public static void main(String args[]) {
        Integer arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}