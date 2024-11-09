package guru.springframework.spring5webapp.multithreading;

public class MultithreadRunnable implements Runnable {
    public void run(){
        synchronized (this) {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch (Exception e) {
                System.out.println("Exception is caught");
            }
        }
    }

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            /**thread object is created because runnable interface does not have start method **/
            Thread thread=new Thread(new MultithreadRunnable());
            thread.start();
        }
    }
}
