class Bank { 
     int balance = 100;
  synchronized   void withdraw(int amt) {
            System.out.println(Thread.currentThread().getName() + " checking balance...");
            if (balance >= amt) {
                System.out.println(Thread.currentThread().getName() + " proceeding withdraw...");
                balance = balance - amt;
                System.out.println("Balance left: " + balance);
            } else {
                System.out.println("Not enough balance");
            }
        }
    }

    class MyThread4 extends Thread {
        Bank b;
        MyThread4(Bank b) { this.b = b; }

        public void run() {
            b.withdraw(100);
        }
    }

 class Multithreading4{
        public static void main(String[] args) {
            Bank b = new Bank();
            MyThread4 t1 = new MyThread4(b);
            MyThread4 t2 = new MyThread4(b);
            t1.setName("om");
            t2.setName("Aman");
            t1.start();
            t2.start();
        }
    }