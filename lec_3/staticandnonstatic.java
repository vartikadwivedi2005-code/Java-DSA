interface MyInterface {
    void instanceMethod();
    static void staticMethod() {
        System.out.println("Interface static:");
    }
}

class parent implements MyInterface {
    public void instanceMethod() {
        System.out.println("Parent instance method:");
    }
}
class child implements MyInterface {
    public void instanceMethod() {
        System.out.println("Child instance method:");
    }
}


class InterfaceDemoMain {
    public static void main(String[] args) {
        MyInterface obj = new child();
        obj.instanceMethod();  // Works - calls Child's instanceMethod
        // obj.staticMethod();  // Won't work - can't call static method through instance
        MyInterface.staticMethod();  // Correct way to call interface static method
    }
}