package com.company.Example11;

import java.util.concurrent.*;

public class Example11 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> s = ex.submit(new MyThread());
        Future<Integer> s1 = ex.submit(new MyThread());
        try {
            System.out.println("а я уже здесь");
            System.out.println(s.get());
            System.out.println(s1.get());
        } catch (InterruptedException e) {	e.printStackTrace();
        } catch (ExecutionException e) {e.printStackTrace();	}
    }

}
class MyThread implements Callable<Integer> {
    public int count = 0;
    public Integer call() {
        for (int i = 0; i < 1000000; i++) {
            count++;
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }
}
