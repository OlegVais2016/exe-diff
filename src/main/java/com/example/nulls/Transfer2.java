package com.example.nulls;

public class Transfer2 {

    static Integer number = 1;

    public static void changeIt(Integer s) {
        s = 2;
    }

    public static void main(String[] args) {
        changeIt(number);
        System.out.println(number);
    }
}
