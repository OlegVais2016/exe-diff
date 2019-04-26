package com.example.exe_diff;

public class Abs {
    public static void main(String[] args) {

        System.out.println(abs(1));
        System.out.println(abs(-1));
    }
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }
}
