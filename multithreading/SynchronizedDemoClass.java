package guru.springframework.spring5webapp.multithreading;

/** as t1 and t2 holds lock on object as t1 gets started so t1 acquires the lock of display object and t2 will not be allowed to enter until t1 finishes
 * when display number is non synchronised and display characters is synchronised both threads will run consequently because t1 would not require a lock to execute
 * so it would run as soon as thread is started while t2 will acquire a lock so that if any other thread wants to execute display characters it would have to wait
 */
class Display {
    public  static synchronized void displayNumber() {
        for (int i = 0; i < 3; i++) {
            System.out.println("I am in number method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I am caught");
            }
        }
    }

    public  void displayCharacters() {
        for (int i = 65; i < 67; i++) {
            System.out.println("I am in display characters method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I am caught");
            }
        }
    }
}

class MyThread1 extends Thread {
    Display d;

    MyThread1(Display display) {
        this.d = display;
    }

    @Override
    public void run() {
        d.displayNumber();
    }
}

class MyThread2 extends Thread {
    Display d;

    MyThread2(Display display) {
        this.d = display;
    }

    @Override
    public void run() {
        d.displayCharacters();
    }
}


public class SynchronizedDemoClass {
    public static void main(String[] args) {
        Display display = new Display();
        MyThread1 myThread1 = new MyThread1(display);
        MyThread2 myThread2 = new MyThread2(display);
        myThread1.start();
        myThread2.start();
    }
}
