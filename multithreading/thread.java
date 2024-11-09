package guru.springframework.spring5webapp.multithreading;

public class thread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join() method on thread2 -" + Test.thread1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }

    }
}
