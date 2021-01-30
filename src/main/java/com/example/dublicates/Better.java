package com.example.dublicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Better {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "cow", "sheep", "cat", "dog"};
        System.out.println("Входной массив: " + Arrays.toString(animals));
        System.out.println("Дубликаты: " + getDub(animals));
    }
    public static Boolean getDub(String[] a){
        List<String> list = Arrays.asList(a);
        Set<String> set = new HashSet<>(list);
        int l = list.size();
        int s = set.size();
        if (s < l) return true;
        else return false;

    }
}
