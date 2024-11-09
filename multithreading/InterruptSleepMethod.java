package guru.springframework.spring5webapp.multithreading;

class SleepMethod extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I am in run method and I am lazy");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            /** as soon as main thread interrupts it comes out of for loop and enters catch block **/
            System.out.println("I am caught");
        }
    }
}

public class InterruptSleepMethod {
    public static void main(String[] args) {
        SleepMethod sleepMethod=new SleepMethod();
        sleepMethod.start();
        /** the main thread is interrupted child thread it catches and stops the program **/
       sleepMethod.interrupt();
        System.out.println("I am running main method");
    }

}
