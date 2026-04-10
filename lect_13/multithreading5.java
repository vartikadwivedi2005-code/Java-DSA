import java.io.*;
class MyThread5 implements Runnable{
    public void run(){
        System.out.println("hello");
        for(int  i=0;i<5;i++){
        System.out.println(i);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
        }
      }
    }
}
class MultiThreading5{
    public static void main(String[] args){
       MyThread task=new MyThread();
       Thread t1=new Thread(task);
         Thread t2=new Thread(task);
       t1.start();
       t2.start();
    }
}
