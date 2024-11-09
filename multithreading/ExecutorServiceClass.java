package guru.springframework.spring5webapp.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class ExecutorServiceClass {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        /** Callable task is an interface from the java.util.concurrent package
         * that represents a task that can be executed concurrently and returns a result.
         * Unlike Runnable, which does not return a result and cannot throw checked exceptions,
         * Callable can return a result and throw checked exceptions. This makes Callable more flexible
         * and suitable for tasks that require a result or may throw an exception.**/

        Runnable task = () -> {
            try {
                System.out.println("In runnable task");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
                e.printStackTrace();
            }
        };

        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "In callable task";
        };
        Callable<String> callableTask1 = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "In callable task1";
        };
        Callable<String> callableTask2 = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "In callable task2";
        };
        List<Callable<String>> callableTasks = new ArrayList<>();
        // Instance initialization block
        /**An instance initialization block is used to initialize the dataList with some initial data which cannot be done directly at class level.
         The instance initialization block is executed each time an instance of the class is created.
         When you create an instance of MyClass (e.g., obj), the dataList is initialized with the specified data, and you can then access and print using method.**/
        {
            callableTasks.add(callableTask);
            callableTasks.add(callableTask1);
            callableTasks.add(callableTask2);
        }
        {
            /**The execute() method is void and doesn’t give any possibility to get the result of a task’s execution
             *  or to check the task’s status (is it running):**/
            executor.execute(task);

            /**submits a Callable or a Runnable task to an ExecutorService and returns a result of type Future:**/
            Future<String> future = executor.submit(callableTask);
            try {
                /**assigns a collection of tasks to an ExecutorService, causing each to run, and returns the result of a
                 * successful execution of one task**/
                String result = executor.invokeAny(callableTasks);
                System.out.println(result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        /**The shutdown() method doesn’t cause immediate destruction of the ExecutorService.
         * It will make the ExecutorService stop accepting new tasks and shut down after
         * all running threads finish their current work**/
        executor.shutdown();
        /** the request will not be accepted, will throw an error **/
        executor.execute(task);
        /**The shutdownNow() method tries to destroy the ExecutorService immediately,
         * but it doesn’t guarantee that all the running threads will be stopped at the same time:
         * This method returns a list of tasks that are waiting to be processed.**/
        List<Runnable> notExecutedTasks = executor.shutdownNow();
        /**With this approach, the ExecutorService will first stop taking new tasks and then wait up to
         *  a specified period of time for all tasks to be completed. If that time expires, the execution is stopped immediately.**/
        try {
            if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        /**The ScheduledExecutorService runs tasks after some predefined delay and/or periodically.**/
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        /** to delay a task or schedule use a schedule method **/
        Future<String> resultFuture = executorService.schedule(callableTask, 1, TimeUnit.SECONDS);

        /** The following block of code will run a task after an initial delay of 100 milliseconds. And after that, it will run the same task every 450 milliseconds:**/
        executorService.scheduleAtFixedRate(task, 100, 450, TimeUnit.MILLISECONDS);

        /**the following code will guarantee a 150-millisecond pause between the end of the current execution and the start of another one:**/
        executorService.scheduleWithFixedDelay(task, 100, 150, TimeUnit.MILLISECONDS);
    }

}