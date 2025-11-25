import java.util.Objects;
import java.util.Scanner;

class object{
    void sum(){
        System.out.println("hello");

    }
    void sum(int a){
        System.out.println(a);

    }
    void sum(int a,int b){
        System.out.println(a+b);

    }
    public static void main(String[] args)
   {
    object obj=new object();
    obj.sum(5,5);
   }
}