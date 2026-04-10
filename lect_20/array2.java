package lect_20;

public class array2 {
    public static void main(String[] args){
        int arr[]={3,5,0,0,7,0,1,0,4};
        int ptr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[ptr]=arr[i];
                arr[i]=temp;
                ptr++;
            }
            
              
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
