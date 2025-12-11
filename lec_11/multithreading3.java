class MyThread3 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("downloading file..." + (i*20)+ "%");
            try {
                Thread.sleep(4000);
            }
            catch (Exception e){
            }
        }
    }
}
class MultiThreading3{
    public static void main(String[] args){
    System.out.println(Thread.currentThread().getName());
        MyThread3 t1=new MyThread3();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("Timer" + i);
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
            }
        }
    }
}