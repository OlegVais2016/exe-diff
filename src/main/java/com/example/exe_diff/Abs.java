package com.example.exe_diff;

public class Abs {
    public static void main(String[] args) {

        int s = 4;

        System.out.println(s++);
        System.out.println(s++);

        System.out.println(abs(1));
        System.out.println(abs(-4));
    }
    public static int abs(int a) {
        return (a < 0) ? a : a;
    }
}
