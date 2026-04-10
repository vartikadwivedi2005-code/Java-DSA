import java.util.*;
public class basic{
    public static void main(String[] args){
        String str1= "Hello";
        String str2= new String("Hi");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.substring(0,3));
        System.out.println(str1.replace('l','z' ));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("Hello"));

    }
}