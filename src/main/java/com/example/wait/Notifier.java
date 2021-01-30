package com.example.wait;

public class Notifier implements Runnable{

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(10000);
            synchronized (msg) {
                msg.setMsg(name + " поток Notifier отработал");
                msg.notify();
                // msg.notifyAll();
                msg.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
