package com.example.nulls;

public class Transfer4 {

    static final String str = "Value 1";

    public static String changeIt(String s) {
        s = "Value 2";
        return s;
    }
    public static void main(String[] args) {
        ;
        System.out.println(changeIt(str));
    }
}
