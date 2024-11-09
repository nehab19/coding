package guru.springframework.spring5webapp.multithreading;

import java.util.concurrent.locks.Lock;

class SharedResource {
    private Lock lock = new java.util.concurrent.locks.ReentrantLock(true);

    public void performTask(String threadName) {
        lock.lock();
        try {
            System.out.println("I am trying to execute and I am : " + threadName);
            for (int i = 0; i <= 3; i++) {
                System.out.println("Hi I am : " + threadName);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println(threadName + " is releasing the lock");
            lock.unlock();
        }
    }
}

class WorkerThread extends Thread {
    String threadName;
    SharedResource sharedResource;

    WorkerThread(SharedResource sharedResource, String threadName) {
        this.threadName = threadName;
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.performTask(threadName);
    }
}

public class ReentrantLock {
    public static void main(String[] args) {

        SharedResource sharedResource=new SharedResource();

        Thread thread1=new WorkerThread(sharedResource,"thread1");
        Thread thread2=new WorkerThread(sharedResource,"thread2");
        thread1.start();
        thread2.start();

    }
}

