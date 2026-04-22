package lect_27;

public class fabonaci {
    static void fibo(String s , int n){
        if(n == 0){
            System.out.println(s);
            return;
        }
        fibo(s + "0" , n-1);
        fibo(s + "1" , n-1);
    }
    public static void main(String[] args){
        int n = 2;
        fibo("" , n);
    }
}
