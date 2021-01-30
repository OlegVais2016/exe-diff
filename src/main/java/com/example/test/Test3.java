package com.example.test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(str.toCharArray());
        char[] arr = str.toCharArray();
        System.out.println(arr);
        String strArr[] = str.split("");
        System.out.println(Arrays.toString(strArr));

        String s = "Hello";
        String[]array = s.split("");
        String s2 = Arrays.toString(array);
        System.out.println(s2);
    }
}
