package com.example.exe_diff;

import static com.example.exe_diff.ReverseStringRecursion.reverseStringWithRecursion;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2(t1));

        t1.start();
        t2.start();
        System.out.println(reverseStringWithRecursion("hello"));
    }


}