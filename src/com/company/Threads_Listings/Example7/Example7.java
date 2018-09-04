package com.company.Example7;

public class Example7 {
    public static void main(String[] args) {
        final SynchroMethodDemo ooim = new SynchroMethodDemo("obj1");
        Runnable runA = new Runnable() {
            public void run() {
                ooim.doStuff(3);
            }
        };
        Thread threadA = new Thread(runA, "threadA");
        threadA.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException x) {
        }
        Runnable runB = new Runnable() {
            public void run() {
                ooim.doStuff(7);
            }
        };
        Thread threadB = new Thread(runB, "threadB");
        threadB.start();
    }
}

class SynchroMethodDemo {
    private String objID;

    public SynchroMethodDemo(String objID) {
        this.objID = objID;
    }

    public synchronized void doStuff(int val) {
        print("entering doStuff()");
        int num = val * 2 + objID.length();
        print("local variable num=" + num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException x) {
        }
        print("leaving doStuff()");
    }

    public void print(String msg) {
        threadPrint("objID=" + objID + " - " + msg);
    }

    public static void threadPrint(String msg) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": " + msg);
    }
}
