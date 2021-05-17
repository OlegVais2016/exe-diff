package com.example.quiz.part1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
            System.out.println("A");
        else if (one.equals(two))
            System.out.println("B");
        else
            System.out.println("C");

        String s = "purr";
        s.toUpperCase();
        System.out.println(s.toUpperCase());
        s.trim();
        System.out.println(s.trim());
        s.substring(1, 3);
        System.out.println(s.substring(1, 3));
        s += " two";
        System.out.println(s);
        System.out.println(s.length());
    }
}
