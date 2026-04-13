package lect_24;

public class recursion2 {
    static int power(int x , int n){
          if(n == 0)
            return 1;   //base case
          return x * power(x , n-1);// recursive function

        //   1 -> 2 * power(x=2,n-1=3)  //8
        //   2 -> 2 * power(x=2,n-1=2)  //4
        //   3 -> 2 * power(x=2,n-1=1)  //2
        //   4 -> 2 * power(x=2,n-1=0)  //1
    }
    public static void main(String[] args){
        int x = 2;
        int n = 4;
        System.out.println(power(x,n));
    }
}
