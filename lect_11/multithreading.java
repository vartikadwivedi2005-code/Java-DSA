//MultiThreading
//By default name of thread is main
class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        System.out.println(Thread.currentThread().getName());
    }
}
class MultiThreading {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        MyThread t1=new MyThread();
        t1.start();
        

    }
}