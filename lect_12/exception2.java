 class Exception2 {
  public static void main(String[] args) {
     System.out.println("Program Start");
       int arr[]=new int[5];
       System.out.println(arr[6]);
      
      try {
         String str=null;
         System.out.println(str.length());
            
      } catch (ArithmeticException e) {
          System.out.println(e);
     }

       int a = 10;
       int b = 0;

         int result = a / b;  
       System.out.println("Result: " + result);
      System.out.println("Program End");
    
    }
}