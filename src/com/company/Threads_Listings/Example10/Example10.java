package com.company.Example10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example10 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new MyThread());
        ex.execute(new MyThread());
    }

}
class MyThread implements Runnable {
    public int count = 0;
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        System.out.println(count);
    }
}
