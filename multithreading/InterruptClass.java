package guru.springframework.spring5webapp.multithreading;


class DemoInterruptClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am in run method");
        }
        System.out.println("I want to sleep");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }


}

public class InterruptClass {
    public static void main(String[] args) {
        DemoInterruptClass demoInterruptClass = new DemoInterruptClass();
        demoInterruptClass.start();
        /** this interrupt call will interrupt the child thread to enter into interrupted exception **/
        /** after executing the for loop the thread will sleep and enter into catch block of interrupted exception **/
        /** if there is interrupt call and child thread never goes into waiting state then interrupt call gets wasted **/
        demoInterruptClass.interrupt();
        for (int i = 0; i < 3; i++) {
            System.out.println("I am in main class");
        }

    }
}

