package conc.sycro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count cnt = new Count();
        Lock l = new ReentrantLock();

        Adder ad = new Adder(cnt);
        Subtract sub = new Subtract(cnt, l);

        Thread tr1 = new Thread(ad);
        Thread tr2 = new Thread(sub);

        tr1.start();
        tr2.start();

        tr1.join();
        tr2.join();
        System.out.println(cnt.count);
    }
}
