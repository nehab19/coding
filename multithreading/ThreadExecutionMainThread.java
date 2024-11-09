package guru.springframework.spring5webapp.multithreading;


class ThreadExecute extends Thread {

    /** this would have a reference to main thread**/
    static Thread myThread;

    @Override
    public void run() {
        try {
            /** child thread will now wait until main thread completes execution **/
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("In run method");
        }
    }
}

public class ThreadExecutionMainThread {
    public static void main(String[] args) {
        /** referencing main thread with this static variable **/
        ThreadExecute.myThread = Thread.currentThread();
        ThreadExecute threadExecutionMainThread = new ThreadExecute();
        threadExecutionMainThread.start();
        /** if this line gets uncommented nothing would work as main thread would wait for
         * child thread to complete while child thread would wait for main thread to complete
         * its a kind of deadlock situation
         */
      /*  try {
            threadExecutionMainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println("In main method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
