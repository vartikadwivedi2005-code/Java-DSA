 interface Ash {
 default void play() { System.out.println("A play"); }
 }
 class Bsh implements Ash {
 public void play() {
 System.out.println("B play");
 }
}
class InterfaceDemo2 {
 public static void main(String[] args) {
 Ash obj = new Bsh();
 obj.play();
 }
}