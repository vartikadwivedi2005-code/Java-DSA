
interface LoginInterface {
    void login();
}

class BshImpl implements LoginInterface {
    public void login() {
        System.out.println("hello");
    }
}

class Login { // Class name starts with uppercase
    public static void main(String[] args) {
        BshImpl s1 = new BshImpl();
        s1.login(); // Output: hello
        
        // Alternative: Using interface reference (good practice)
        LoginInterface obj = new BshImpl();
        obj.login(); // Output: hello
    }
}