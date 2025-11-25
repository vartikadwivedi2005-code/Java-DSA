package lec_2;

//import java.util.Objects;


class hello{
    int sum(int arr[][]){
        int data=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                data+=arr[i][j];
            }
        }
        return data;
    }
    public static void main(String[] args){
        int arr[][]={{1,2},{3,4}};
        hello s1=new hello();
        int val= s1.sum(arr);
        System.out.println(val);

    }
}