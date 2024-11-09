package guru.springframework.spring5webapp.multithreading;

class MyThreadClass extends Thread {
    DisplayClass displayClass;
    String name;

    MyThreadClass(DisplayClass displayClass, String name) {
        this.displayClass = displayClass;
        this.name = name;
    }
    @Override
    public void run(){
        displayClass.wish(name);
    }
}

public class DisplayClass {

    /** if we make wish method static synchronised with two objects d1 and d2 and two threads t1 and t2 the  we would get regular output
     * as static makes a class level lock instead of object level lock,  means if d1 is executing wish method then d2 cannot enter that
     * @param name
     */
    public static synchronized void wish(String name) {
        for (int i = 0; i < 2; i++) {
            System.out.print("Hi, I am in wish method : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I am caught");
            }
            System.out.println(name);
        }
    }
}

class Synchronization{
    public static void main(String[] args) {
        DisplayClass displayClass=new DisplayClass();
        /** multiple threads are trying to execute same method simultaneously so the output is not guaranteed **/
        /** to achieve that only one thread executes at a time make wish method syncronized **/
        /** after syncronized one thread at a time will execute **/
       /* MyThreadClass myThreadClass1=new MyThreadClass(displayClass,"Neha");
        MyThreadClass myThreadClass2=new MyThreadClass(displayClass,"Savita");
        MyThreadClass myThreadClass3=new MyThreadClass(displayClass,"Ashu");
        myThreadClass1.start();
        myThreadClass2.start();
        myThreadClass3.start();*/


        /** When the object is different, lets say d1 and d2 and 2 threads t1 and t1 so t1 acquires the lock for d1 and t2 will acquire lock for
         * d2  both have different objects and each object has a lock so even if wish method is synchronized both threads will get chance and
         * will give an irregular output, meaning both threads will execute simultaneously.
         */

        DisplayClass d1=new DisplayClass();
        DisplayClass d2=new DisplayClass();
        MyThreadClass myThreadClass1=new MyThreadClass(d1,"Neha");
        MyThreadClass myThreadClass2=new MyThreadClass(d2,"Savita");
        myThreadClass1.start();
        myThreadClass2.start();

    }
}
