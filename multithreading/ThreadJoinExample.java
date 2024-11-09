package guru.springframework.spring5webapp.multithreading;

/** When the join() method is invoked, the current thread stops
 * its execution and the thread goes into the wait state.
 * The current thread remains in the wait state until the thread on which the join()
 * method is invoked has achieved its dead state. If interruption of the thread occurs,
 * then it throws the InterruptedException.**/

class ThreadJoin extends Thread {
    // overriding the run method
    public void run() {
        System.out.println("Running ThreadJoin for thread " + Thread.currentThread().getName());
        for (int j = 0; j < 1; j++) {
            try {
                Thread.sleep(300);
                System.out.println("Running after calling sleep method");
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println(j);
        }
    }
}

public class ThreadJoinExample {
    // main method
    public static void main(String argvs[]) {

        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();

        th1.start();
        try {
            System.out.println("After th1.start");
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            /**here the main threa waits for th1 to complete its process before th2 starts **/
            th1.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }
        System.out.println("State of thread1 is " + th1.getState()); //terminated state

        th2.start();
        System.out.println("After th2.start");
    }
}
