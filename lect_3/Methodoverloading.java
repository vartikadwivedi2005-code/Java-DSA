class Mathoperations{
public int add(int a,int b){
    return a+b;
}
public int sub(int a,int b){
    return a-b;
}
public int mul(int a,int b)
{
    return a*b;
}
}
 class Methodoverloading{
    public static void main(String[] args){
        Mathoperations math=new Mathoperations();

        System.out.println("Addition of two numbers:" +math.add(5,10));
        System.out.println("Substraction of two numbers:" +math.sub(15,8));
        System.out.println("Multiplication of two numbers:" +math.mul(5,6));
    }
}