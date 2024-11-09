package guru.springframework.spring5webapp.multithreading;

public class SlideRotator {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; --i) {
            System.out.println("Slide : " + i);
            /** the thread would sleep for 5 sec and then execute at every iteration **/
            Thread.sleep(1000);
        }
    }
}
