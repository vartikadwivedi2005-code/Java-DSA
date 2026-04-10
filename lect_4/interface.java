interface Ash {
    void sleep();
    default void data() {
        System.out.println("hehe");
    }
}

class Bsh implements Ash {  // Bsh as a class implementing Ash
    public void sleep() {
        System.out.println("byee");
    }
}

class Csh implements Ash {
    public void sleep() {
        System.out.println("hello");
    }
}

class InterfaceDemo {
    
    public static void main(String[] args) {
        Bsh b = new Bsh();
        b.sleep();  // Output: byee
        b.data();   // Output: hehe
        
        Csh c = new Csh();
        c.sleep();  // Output: hello
        c.data();   // Output: hehe
    }
}