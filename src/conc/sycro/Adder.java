package conc.sycro;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    public Count c;
    public Adder(Count c){
        this.c = c;
    }
    @Override
    public void run() {
        for(int i = 1; i<=100000; i++){
           synchronized (c){
               ArrayList<Long> arr = new ArrayList<>();
//               arr.get();
               this.c.count = this.c.count+1;
           }
        }
    }
}
