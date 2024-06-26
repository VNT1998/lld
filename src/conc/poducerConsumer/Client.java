package conc.poducerConsumer;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedDeque<>();
        int maxSize = 6;
        Producer p1 = new Producer(store, "P1", maxSize);
        Producer p2 = new Producer(store, "P2", maxSize);
        Producer p3 = new Producer(store, "P3", maxSize);
        Producer p4 = new Producer(store, "P4", maxSize);
        Producer p5 = new Producer(store, "P5", maxSize);
        Consumer c1 = new Consumer(store, "C1", maxSize);
        Consumer c2 = new Consumer(store, "C1", maxSize);
        Consumer c3 = new Consumer(store, "C1", maxSize);


    }
}
