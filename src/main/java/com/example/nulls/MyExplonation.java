package com.example.nulls;

public class MyExplonation {

    static Integer number = 6;
    static Integer s = Integer.parseInt("4");
    static String ss = s.toString();
    public static int changeOne(Integer number) {
        return number * 2;
    }
    public static int changeTwo(Integer number) {
        return number * 3;
    }
    public static void main(String[] args) {

        System.out.println(changeOne(number));
        System.out.println(changeTwo(number));
        System.out.println(s);
        System.out.println(ss);
    }
}
