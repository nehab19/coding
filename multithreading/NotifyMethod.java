package guru.springframework.spring5webapp.multithreading;

class MyThreadNotify extends Thread {
    int total = 0;

    @Override
    public void run() {
        System.out.println("Hi i am in run");
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                total = total + i;
            }
            this.notify();
        }
        System.out.println("Hello");
    }
}

public class NotifyMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThreadNotify myThreadNotify = new MyThreadNotify();
        myThreadNotify.start();
        synchronized (myThreadNotify) {
            /** if my chance child thread gets priority then main thread will enter into waiting state and it won't get notified, so to solve this problem
             * wait method should be called with time period.
             */
            myThreadNotify.wait(10000);
        }
        System.out.println("After wait : " + myThreadNotify.total);
    }
}
