abstract class Shape{
    abstract void area();

    

}
class circle extends Shape{
    int r;
    public circle(int r){
        this.r=r;
    }
    void area(){
        double result=3.14*r*r;
        System.out.println(result);
    }
}
class rectangle extends Shape{
    int length;
    int b;

    public rectangle(int length,int b ){
        this.length=length;
        this.b=b;
    }
    void area(){
        double result=length*b;
        System.out.println(result);
    }
}
class ShapeDemo{
    public static void main(String[] args){
       circle s1=new circle(4);
       s1.area();
       rectangle s2=new rectangle(4,5);
       s2.area();
    }
}