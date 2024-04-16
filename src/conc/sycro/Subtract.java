package conc.sycro;

import java.util.concurrent.locks.Lock;

public class Subtract implements Runnable{
    public Count c;
    public Lock l;
    public Subtract(Count c, Lock l){
        this.c = c;
        this.l = l;
    }
    @Override
    public void run() {
        for(int i = 1; i<=100000; i++){
            l.lock();
            this.c.count = this.c.count-1;
            l.unlock();
        }
    }
}
