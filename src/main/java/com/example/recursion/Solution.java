package com.example.recursion;

import java.util.List;

public class Solution {

    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии / рекурсивное условие
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(10)); // вызов рекурсивной функции
    }

}

class A{

}

class B extends A{
    public static void callMe(List<A> i){

    }
}

