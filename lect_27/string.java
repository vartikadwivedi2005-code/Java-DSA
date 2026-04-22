package lect_27;

public class string {
    static void fibo(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        fibo(p+ch ,up.substring(1));
        fibo(p , up.substring(1));

    }
    public static void main(String[] args){
        String up = "abc";
        fibo("",up);

    }
}
