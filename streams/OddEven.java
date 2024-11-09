package guru.springframework.spring5webapp.streams;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class OddEven {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<Void> printEven = CompletableFuture.runAsync(() -> {
            IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(number -> System.out.println("Even number is " + number));
        });

        CompletableFuture<Void> printOdd = CompletableFuture.runAsync(() -> {
            IntStream.rangeClosed(1, 10).filter(n -> n % 2 != 0).forEach(number -> System.out.println("Odd number is " + number));
        });

        CompletableFuture<Void> combined = CompletableFuture.allOf(printEven, printOdd);
        //The join() method is used to block the main thread until both futures are completed.
        combined.join();
    }
}
