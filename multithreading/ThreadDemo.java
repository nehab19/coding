package guru.springframework.spring5webapp.multithreading;

/**using thread class**/
public class ThreadDemo extends Thread{
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
            Demo multiThread=new Demo();
            multiThread.start();
        }
    }
}
