interface Interface {
    void instanceMethod();
    static void staticMethod() {
        System.out.println("Interface static:");
    }
}

class Parent implements Interface {
    static void staticMethod(){
        System.out.println("Parent static:");
    }
    
    public void instanceMethod(){
        System.out.println("parent instance:");
    }
}

class Child implements Interface {
    static void staticMethod(){
        System.out.println("Child static:");
    }
    
    public void instanceMethod(){
        System.out.println("child instance:");
    }
}

class InterfaceDemo {
    public static void main(String[] args){
        Interface obj = new Child();
        obj.instanceMethod();  // Works - calls Child's instanceMethod
        // obj.staticMethod();  // Won't work - can't call static method through instance
        Interface.staticMethod();  // Correct way to call interface static method
    }
}