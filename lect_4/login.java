
interface ash {

    void login();

}

class bsh implements ash {
    public void login() {
        System.out.println("hello");
    }
}

class login { // Class name matches file name
    public static void main(String[] args) {
        bsh s1 = new bsh();
        s1.login(); // Output: hello
        
        // Alternative: Using interface reference (good practice)
        ash obj = new bsh();
        obj.login(); // Output: hello
    }
}