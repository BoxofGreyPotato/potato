package _5domashka;


import java.util.Scanner;

public class Proga extends Thread{
    public static void main(String[] args) {
        System.out.println("Салахов Айдар Ильдарович РИБО-04-22 4 вариант");



        System.out.println("Практика 1.14" + "\n");
        //Runnable task = new MyWorkTask();
        int res = 0;
        /*for (int i = 0; i < 2; i++){

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!Thread.currentThread().isInterrupted()) {
                        synchronized (this) {
                            try {
                                Thread.sleep(100);
                                System.out.println(Thread.currentThread().getName());
                            } catch (InterruptedException ex) {

                            }
                            while(res!=0){
                                this.wait();
                            }
                            notify();
                        }
                    }
                }
            });
            t.setName("Thread "+ i);
            t.start();
        }*/





        /*Thread th1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName());
                    synchronized (this) {
                        try {
                            wait(1000);
                        } catch (InterruptedException ignore) {

                        }
                        notify();
                    }
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName());
                    synchronized (Thread.class) {
                        try {
                            wait(1000);
                        } catch (InterruptedException ignore) {

                        }
                        notify();
                    }
                }
            }
        });*/


        Thread th1 = new MyWorkTask(1);
        Thread th2 = new MyWorkTask(2);

        th1.start();
        th2.start();


    }
}
