interface Ash { 
    void msg();
 }
 interface Bsh { 
    void msg(); 
}
 class Csh implements Ash, Bsh {
     public void msg() {
         System.out.println("Hello");
 }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Csh obj = new Csh();
        obj.msg();

    }
}