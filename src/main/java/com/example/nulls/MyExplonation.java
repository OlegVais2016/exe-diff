package com.example.nulls;

public class MyExplonation {

    static Integer number = null;

    public static int changeOne(Integer number) {
        return number * 2;
    }
    public static int changeTwo(Integer number) {
        return number * 3;
    }
    public static void main(String[] args) {

        System.out.println(changeOne(number));
        System.out.println(changeTwo(number));
    }
}
