package _5domashka;


import java.util.Scanner;

public class MyWorkTask extends Thread {
    private static final Object locker = new Object();
    private static int number = 1;
    private int numberOfThread;

    public MyWorkTask(int numberOfThread) {
        this.numberOfThread = numberOfThread;
    }
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (!currentThread().isInterrupted()) {
            synchronized (locker) {
                while (numberOfThread != number) {
                    try {
                        locker.wait();
                    } catch (InterruptedException ignore) {}
                }
                System.out.println(current.getName());
                try {
                    sleep(10);
                } catch (InterruptedException ignore) {}
                if (numberOfThread == 1) {
                    number = 2;
                } else {
                    number = 1;
                }
                locker.notify();
            }
        }
    }
}

