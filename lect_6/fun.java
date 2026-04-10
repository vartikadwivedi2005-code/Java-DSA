import java.util.*;
class fun{
    static void fun(int a){    
        if(a>0){     
            fun(--a);   //function call
            System.out.println(a);    
            fun(--a);   //function call
        }
    }
    public static void main(String[] args){
        fun(5);   //initial function call with argument 5
    }
}

//output - 0 1 0 2 0 1 0
//explanation -
//fun(4) -> fun(3) -> fun(2) -> fun(1) -> fun(0) -> returns


