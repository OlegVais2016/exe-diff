package com.example.quiz.part1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(2);
        System.out.println(s);
    }
}