package guru.springframework.spring5webapp.multithreading;

import org.springframework.ui.context.Theme;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    //allowing upto 3 threads to access the resource
    private static final Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            Thread thread=new Thread(new Task(),"Thread" +i);
            thread.start();
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting to acquire a permit..!");
                semaphore.acquire(); //acquired the permit
                System.out.println(Thread.currentThread().getName() + " has acquired the permit!");

                //simultaing some work
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is releasing the permit ");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
