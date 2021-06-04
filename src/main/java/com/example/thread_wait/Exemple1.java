package com.example.thread_wait;



public class Exemple1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        t1.start();
        t2.start();

    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Поток начал работу:::" + Thread.currentThread().getName());
        synchronized (name) {
            try {
                name.wait(3333);
                System.out.println("t1 waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

                name.notify();

            System.out.println("Поток отработал:::" + Thread.currentThread().getName());
        }
    }
}