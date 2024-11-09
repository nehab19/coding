package guru.springframework.spring5webapp.multithreading;

public class Test implements Runnable {
    public static Thread thread1;
    public static Test obj;

    @Override
    public void run() {
        thread myThread = new thread();
        /** When you pass myThread to the Thread constructor,
         * it indicates that myThread will be the target to run when thread2 is started.**/
        Thread thread2 = new Thread(myThread);
        System.out.println("State of thread2 after creating it" + thread2.getState());
        thread2.start();
        System.out.println("State of thread2 after calling start method" + thread2.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling sleep method" + thread2.getState());
        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling join method" + thread2.getState());
    }

    public static void main(String[] args) {
        obj = new Test();
        thread1 = new Thread(obj);
        System.out.println("State of thread1 after creating it" + thread1.getState());
        thread1.start();
        System.out.println("State of thread1 after calling start method" + thread1.getState());
    }


}
