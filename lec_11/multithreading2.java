//MultiThreading
//Timer
//By default name of thread is main
class MyThread2 extends Thread{
    public void run(){
        System.out.println("hello");
        //System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i + "t1");
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                
            }
        }
    }
}
class MultiThreading2 {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        MyThread2 t1=new MyThread2();
        t1.setName("nameChange");
        t1.start();
       // try{
       //       t1.join();
       // }catch (Exception e){

       // }
         for(int i=0;i<5;i++){
            System.out.println(i + "main");
        }

    }
}