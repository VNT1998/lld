package conc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Thread t = null;
//        for(int i = 1; i<= 100; i++){
//            NuberPrinter nuberPrinter = new NuberPrinter(i);
//            t = new Thread(nuberPrinter);
//            t.start();
//        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 1; i<= 100; i++){
            if(i == 5 || i == 10 || i == 95){
                System.out.println("Hello");
            }
            NuberPrinter nuberPrinter = new NuberPrinter(i);
            executorService.submit(nuberPrinter);
      }
        executorService.shutdown();
    }
}
