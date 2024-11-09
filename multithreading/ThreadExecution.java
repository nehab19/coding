package guru.springframework.spring5webapp.multithreading;

/** sleep ,yield and join method **/
/** demo class is top level level and it does not require any instance of another class to be created thats whu it should not be static **/
class DemoClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name in run " + Thread.currentThread().getName());
            System.out.println("In run method");
            //Thread.yield();
            try {
                /* the child threads sleeps for 2000ms */
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class ThreadExecution {

    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.setPriority(1);
        demoClass.start();
        System.out.println("Thread name in main method : " +Thread.currentThread().getName());
        /** this method is executed by main thread and main thread will wait until child child finishes and main thread enters
         * into waiting state */
        try {
            demoClass.join();
            /** the main thread will wit for 10000ms if child thread does not finishes then the main thread will start its execution **/
            //demoClass.join(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main class priority : " + Thread.currentThread().getPriority());
        System.out.println("Child class priority : " + demoClass.getPriority());
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread name in main " + Thread.currentThread().getName());
            System.out.println("In main method");
        }

    }
}
