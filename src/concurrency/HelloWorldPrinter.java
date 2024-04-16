package concurrency;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Running custom process");
    }
}
