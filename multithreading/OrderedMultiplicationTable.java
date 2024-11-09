package guru.springframework.spring5webapp.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*class TablePrinter {
    private int currentThreadNumber = 1;

    public synchronized void printTable(int threadStart, int threadEnd) {
        for (int i = threadStart; i <= threadEnd; i++) {
            while (currentThreadNumber != i) {
                try {
                    wait();
                } catch (Exception e) {
                    System.out.println("Exception caught while waiting for threads");
                }
            }
            System.out.println("5 * " + i + "=" + 5 * i);
            currentThreadNumber++;
            notifyAll();
        }
    }
}*/
class TablePrinter {
    private final Lock lock=new ReentrantLock(true);
    private int currentThreadNumber = 1;

    public void printTable(int threadStart, int threadEnd,String threadName) {
        System.out.println("Hi "+threadName);
        try {
            lock.lock();
            System.out.println("Hi I am the thread trying to acquire the lock : "+threadName);
            for (int i = threadStart; i <= threadEnd; i++) {
                while (currentThreadNumber != i) {
                    System.out.println("Hi I am the thread trying to release the lock : "+threadName);
                    lock.unlock();
                    Thread.sleep(10);
                    System.out.println("Hi I am the thread trying to acquire the lock again : "+threadName);
                    lock.lock();
                    System.out.println("Hi I am the thread which has the lock again : "+threadName);
                }
                System.out.println("5 * " + i + "=" + 5 * i);
                currentThreadNumber++;
                //notifyAll();
            }
        }catch (Exception e){
            System.out.println("Exception caught");
        }finally {
            lock.unlock();
        }
    }
}

class WorkerThreads extends Thread {

    private TablePrinter tablePrinter;
    private int start, end;
    String threadName;

    WorkerThreads(TablePrinter tablePrinter, int start, int end,String threadName) {
        this.tablePrinter = tablePrinter;
        this.start = start;
        this.end = end;
        this.threadName=threadName;
    }

    @Override
    public void run() {
        tablePrinter.printTable(start, end,threadName);
    }
}


public class OrderedMultiplicationTable {
    public static void main(String[] args) {
        TablePrinter tablePrinter = new TablePrinter();

        WorkerThreads workerThreads1 = new WorkerThreads(tablePrinter, 1, 4,"thread1");
        WorkerThreads workerThreads2 = new WorkerThreads(tablePrinter, 5, 7,"thread2");
        WorkerThreads workerThreads3 = new WorkerThreads(tablePrinter, 8, 10,"thread3");

        workerThreads2.start();
        workerThreads1.start();
        workerThreads3.start();

    }
}
