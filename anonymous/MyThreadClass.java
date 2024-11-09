package guru.springframework.spring5webapp.anonymous;

public class MyThreadClass {
    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public void run(){
                System.out.println("Hi I am in run method!");
            }
        };
        thread.start();
    }
}
