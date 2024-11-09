package guru.springframework.spring5webapp.multithreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private ReentrantReadWriteLock readWriteReentrantLock = new ReentrantReadWriteLock();

    public void writeData(int data) {
        readWriteReentrantLock.writeLock().lock();
        try {
            System.out.println("Reading data : " + data);
        } finally {
            readWriteReentrantLock.writeLock().unlock();
        }
    }

    public void readData(int data) {
        readWriteReentrantLock.readLock().lock();
        try {
            System.out.println("Writing data : " + data);
        } finally {
            readWriteReentrantLock.readLock().unlock();
        }
    }
}

public class ReadWriteReentrantLock {
    public static void main(String[] args) {

        SharedData sharedData = new SharedData();

        Thread threadWriter = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                sharedData.writeData(i);
            }
        });

        Thread threadReader = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                sharedData.readData(i);
            }
        });

        threadReader.start();
        threadWriter.start();

        try{
            threadReader.join();
            threadWriter.join();
        }catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
