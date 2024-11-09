package guru.springframework.spring5webapp.multithreading;

class ThreadDemoClass extends Thread {
    DisplayMethod displayMethod;
    String name;

    ThreadDemoClass(DisplayMethod displayMethod, String name) {
        this.displayMethod = displayMethod;
        this.name = name;
    }

    @Override
    public void run() {
        displayMethod.wish(name);
    }
}

class DisplayMethod {
    public void wish(String name) {

        /** now as only for loop requires synchronisation, so instead od declaring the whole method synchronised we will just declare
         * synchronised block so that only the lines which requires synchronisation will be synchronised.
         */

        /** lets assume it has around 10k lines **/
        /** here if we create 2 objects of display and want synchronisation to work then class level lock is required **/
       // synchronized (DisplayMethod.class)
        synchronized (this) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Hi, I am in wish method!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Exception caught!");
                }
                System.out.println(name);
            }
        }
        /** lets assume it has around 10k lines **/
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        DisplayMethod d1 = new DisplayMethod();
        DisplayMethod d2 = new DisplayMethod();
        ThreadDemoClass myThreadClass1 = new ThreadDemoClass(d1, "Neha");
        ThreadDemoClass myThreadClass2 = new ThreadDemoClass(d2, "Savita");
        myThreadClass1.start();
        myThreadClass2.start();
    }
}
