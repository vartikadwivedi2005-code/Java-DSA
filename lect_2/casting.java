
class AnimalBase{
    void eat(){
        System.out.println("pizza");
    }

    
}
class Doggy extends AnimalBase{
    void eat(){
        System.out.println("biryani");
    }
    void data(){
        System.out.println("hello");
    }

}
class casting{
    public static void main(String[] args){
    Doggy s1=new Doggy();
    s1.eat();
   // AnimalBase s1=new Doggy();  //upper casting
    //s1.eat();
    //Doggy s2=(Doggy) s1;
    //s2.data();
  }
}