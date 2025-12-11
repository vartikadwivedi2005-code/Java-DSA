//MultiThreading
//By default name of thread is main
class MyThread1 extends Thread{
    public void run(){
        System.out.println("hello");
        //System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i + "t1");
        }
    }
}
class MultiThreading1 {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        MyThread t1=new MyThread();
        t1.setName("nameChange");
        t1.start();
        try{
              t1.join();
        }catch (Exception e){

        }
         for(int i=0;i<5;i++){
            System.out.println(i + "main");
        }

    }
}