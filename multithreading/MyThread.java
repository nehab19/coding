package guru.springframework.spring5webapp.multithreading;


  class Demo extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1; i++) {
                //System.out.println("Thread name in run " +Thread.currentThread().getName());
                System.out.println("In run method");
            }
        }
        public void run(int i){
            System.out.println("In paramaterised run method");
        }
    }

 class MyThread {

    public static void main(String[] args) {
       /* Map<Thread, StackTraceElement[]> allThreads = Thread.getAllStackTraces();
        System.out.println("Current threads before creating ThreadDemo:");
        for (Thread t : allThreads.keySet()) {
            System.out.println(t + ": " + t.getState());
        }*/
        //System.out.println("The name of the thread " +Thread.currentThread().getName());
       /* Thread.currentThread().setName("MyThread");
        System.out.println("The name of the thread after renaming " +Thread.currentThread().getName());*/
      /*  System.out.println("before creating object " +Thread.activeCount());
        System.out.println("main thread priority" +Thread.currentThread().getPriority());*/
        Demo threadDemo = new Demo();
        threadDemo.setPriority(8);
      /*  System.out.println("Thread demo priority " +threadDemo.getPriority());*/
       /* threadDemo.run(6);*/
        threadDemo.start();
        //System.out.println("After the start method " +Thread.activeCount());
        /** after the thread is started and starting it again will give error **/
       // threadDemo.start();
        for (int i = 0; i < 2; i++) {
            //System.out.println(Thread.currentThread().getName());
            System.out.println("In main method");
        }

    }
}
