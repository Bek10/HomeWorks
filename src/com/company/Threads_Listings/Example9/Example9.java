package com.company.Example9;

public class Example9 {
    public static void main(String args[]) throws Exception {
        MyResource sObj = new MyResource();
        new MyThread("MyThread", sObj);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(50);
            System.out.print(".");
        }
        sObj.start();
    }
}
class MyThread implements Runnable {
    MyResource myResource;
    MyThread(String name, MyResource so) {
        myResource = so;
        new Thread(this, name).start();
    }
    public void run() {
        try {
            myResource.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyResource {
    boolean ready = false;
    synchronized void waitFor() throws Exception {
        System.out.println(Thread.currentThread().getName()
                + " is entering waitFor().");
        while (!ready)
            wait();
        System.out.println(Thread.currentThread().getName()
                + " resuming execution.");
    }
    synchronized void start() {
        ready = true;
        notify();
    }
}
