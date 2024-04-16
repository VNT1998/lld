package concurrency;

public class concurrency {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp);
        thread.start();
        System.out.println(thread.getName());
    }
}
