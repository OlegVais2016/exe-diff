package com.example.nulls;

public class Transfer3 {
    static int number = 1;

    public static int changeIt(int s) {
        s = 2;
        return s;
    }

    public static void main(String[] args) {

        System.out.println(number);
        System.out.println(changeIt(number));
    }
}
